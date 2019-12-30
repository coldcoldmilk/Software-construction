package Software_Construction;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class csvIO {
/////////////////////////习题文件///////////////////////////////////
	/**
	 * CsvWriter_exercise方法。生成三套不同的习题文件（加法、减法、混合）
	 * 输入：50道习题数组int[][] data，文件名String csvname
	 * 输出：无
	 * 
	 * */
	public void CsvWriter_exercise (int[] [] data,String csvname) {
		//cvs文件写入部分
		String pathCSVWrite = "d:\\";
		String pathCSVWriter = pathCSVWrite+csvname+"_"+"exercise"+".csv";
		String [] address = {csvname+"_"+"exercise"+".csv"};//字符串数组 TABLE能用哪个？
		Framemain_final.address.add(address);
		ArrayList<String[]> lstFile = new ArrayList<String[]>();
		
		for (int count=0;count<data.length;count++) {
				String f = data[count][1]+""+(char)data[count][2]+""+data[count][3]+"";
				String [] list = {data[count][0]+"",f,data[count][4]+"",data[count][5]+"",data[count][6]+""};//将算式int数组转换为String
				lstFile.add(list);
		}
		try{
			CsvWriter csvWriter = new CsvWriter(pathCSVWriter,',',Charset.forName("gb2312"));
			// 写表头
			String[] csvHeader = {"题号","算式","答案","对错","正确答案"};
			
			csvWriter.writeRecord(csvHeader);
			 // 写内容
			for(int i=0;i<lstFile.size();i++){
				String[] csvContent = lstFile.get(i);
				csvWriter.writeRecord(csvContent);
			}
			csvWriter.close();
			System.out.println("--------------------已完成练习文件写入操作--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	/////////////////////////练习文件///////////////////////////////////
	/**
	 * CsvWriter_exercise方法。生成此套题的练习文件（带答案，不带正确答案）
	 * 输入：50道习题数组ArrayList<String[]> lstFile
	 * 输出：无
	 * 
	 * */
	public void Creat_CSV_practice (ArrayList<String[]> lstFile) {//生成练习文件
		CsvIO_Method f = new CsvIO_Method();
		
		String pathCSVWrite = "d:\\";
		String pathCSVWriter = pathCSVWrite+f.Retuen_Name2()+"practice"+".csv";
		String []address = {f.Retuen_Name2()+"practice"+".csv"};//字符串数组 TABLE能用哪个？
		Framemain_final.address.add(address);
		try{
			CsvWriter csvWriter = new CsvWriter(pathCSVWriter,',',Charset.forName("gb2312"));
			// 写表头
			String[] csvHeader = {"题号","算式","答案","对错","正确答案"};
			
			csvWriter.writeRecord(csvHeader);
			 // 写内容
			for(int i=0;i<lstFile.size();i++){
				String[] csvContent = lstFile.get(i);
				csvWriter.writeRecord(csvContent);
			}
			csvWriter.close();
			System.out.println("--------------------已完成练习文件写入操作--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	/////////////////////////批改文件///////////////////////////////////
	/**
	 * Creat_CSV_check方法。生成此套题的批改文件（带答案，带正确答案）
	 * 输入：50道习题数组ArrayList<String[]> lstFile
	 * 输出：无
	 * 
	 * */
	public void Creat_CSV_check (ArrayList<String[]> lstFile) {//生成练习文件
		CsvIO_Method f = new CsvIO_Method();
		
		String pathCSVWrite = "d:\\";
		String pathCSVWriter = pathCSVWrite+f.Retuen_Name2()+"check"+".csv";
		String address = f.Retuen_Name2()+"check"+".csv";//字符串数组 TABLE能用哪个？
		try{
			CsvWriter csvWriter = new CsvWriter(pathCSVWriter,',',Charset.forName("gb2312"));
			// 写表头
			String[] csvHeader = {"题号","算式","答案","对错","正确答案"};
			
			csvWriter.writeRecord(csvHeader);
			 // 写内容
			for(int i=0;i<lstFile.size();i++){
				String[] csvContent = lstFile.get(i);
				if(csvContent[2].equals(csvContent[4])) {
					csvContent[3]="√";
				}
				else {
					csvContent[3]="×";
				}
				Framemain_final.lstFile.set(i, csvContent);
				System.out.println(csvContent[3]);
				csvWriter.writeRecord(csvContent);
			}
			csvWriter.close();
			System.out.println("--------------------已完成批改文件写入操作--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	/////////////////////////导入文件///////////////////////////////////
	/**
	 * Reader_Book方法。导入文件（根据名字导入不同的文件）
	 * 输入：String name文件名字
	 * 输出：ArrayList<String[]> 文件内的题目list
	 * 
	 * */
	public ArrayList<String[]> Reader_Book (String name) {//这个name是完整的名字
		String pathCSVWrite = "d:\\";
		String pathCSV = pathCSVWrite+name+".csv";
		ArrayList<String[]> lstFile = new ArrayList<String[]>();
		////////////////////////////////////读取部分///////////////////////////
		try {
			// 创建CSV读对象 例如:CsvReader(文件路径，分隔符，编码格式);
			CsvReader reader = new CsvReader(pathCSV,',',Charset.forName("gb2312"));
			  // 跳过表头 如果需要表头的话，这句可以忽略
			reader.readHeaders();
			 // 逐行读入除表头的数据
			while(reader.readRecord()){
				//System.out.println(reader.getRawRecord());
				lstFile.add(reader.getValues());
			}
			reader.close();			
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FrameConfirm_text.sign=1;
		System.out.println("--------------------已完成文件信息读取操作--------------");
		return lstFile;
	}
	public static void main(String[] args) {
		csvIO csvio = new csvIO();
		int [][] data = new int [1][4];
		data[0][0]=1;
		data[0][1]=2;
		data[0][2]=43;
		data[0][3]=5;
		String f = data[0][1]+""+(char)data[0][2]+data[0][3]+"";
		System.out.println(f);
	//	csvio.CsvWriter(data, csvname, csvtype);
	}

}
