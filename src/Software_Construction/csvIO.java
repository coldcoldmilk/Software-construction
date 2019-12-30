package Software_Construction;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class csvIO {
/////////////////////////ϰ���ļ�///////////////////////////////////
	/**
	 * CsvWriter_exercise�������������ײ�ͬ��ϰ���ļ����ӷ�����������ϣ�
	 * ���룺50��ϰ������int[][] data���ļ���String csvname
	 * �������
	 * 
	 * */
	public void CsvWriter_exercise (int[] [] data,String csvname) {
		//cvs�ļ�д�벿��
		String pathCSVWrite = "d:\\";
		String pathCSVWriter = pathCSVWrite+csvname+"_"+"exercise"+".csv";
		String [] address = {csvname+"_"+"exercise"+".csv"};//�ַ������� TABLE�����ĸ���
		Framemain_final.address.add(address);
		ArrayList<String[]> lstFile = new ArrayList<String[]>();
		
		for (int count=0;count<data.length;count++) {
				String f = data[count][1]+""+(char)data[count][2]+""+data[count][3]+"";
				String [] list = {data[count][0]+"",f,data[count][4]+"",data[count][5]+"",data[count][6]+""};//����ʽint����ת��ΪString
				lstFile.add(list);
		}
		try{
			CsvWriter csvWriter = new CsvWriter(pathCSVWriter,',',Charset.forName("gb2312"));
			// д��ͷ
			String[] csvHeader = {"���","��ʽ","��","�Դ�","��ȷ��"};
			
			csvWriter.writeRecord(csvHeader);
			 // д����
			for(int i=0;i<lstFile.size();i++){
				String[] csvContent = lstFile.get(i);
				csvWriter.writeRecord(csvContent);
			}
			csvWriter.close();
			System.out.println("--------------------�������ϰ�ļ�д�����--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	/////////////////////////��ϰ�ļ�///////////////////////////////////
	/**
	 * CsvWriter_exercise���������ɴ��������ϰ�ļ������𰸣�������ȷ�𰸣�
	 * ���룺50��ϰ������ArrayList<String[]> lstFile
	 * �������
	 * 
	 * */
	public void Creat_CSV_practice (ArrayList<String[]> lstFile) {//������ϰ�ļ�
		CsvIO_Method f = new CsvIO_Method();
		
		String pathCSVWrite = "d:\\";
		String pathCSVWriter = pathCSVWrite+f.Retuen_Name2()+"practice"+".csv";
		String []address = {f.Retuen_Name2()+"practice"+".csv"};//�ַ������� TABLE�����ĸ���
		Framemain_final.address.add(address);
		try{
			CsvWriter csvWriter = new CsvWriter(pathCSVWriter,',',Charset.forName("gb2312"));
			// д��ͷ
			String[] csvHeader = {"���","��ʽ","��","�Դ�","��ȷ��"};
			
			csvWriter.writeRecord(csvHeader);
			 // д����
			for(int i=0;i<lstFile.size();i++){
				String[] csvContent = lstFile.get(i);
				csvWriter.writeRecord(csvContent);
			}
			csvWriter.close();
			System.out.println("--------------------�������ϰ�ļ�д�����--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	/////////////////////////�����ļ�///////////////////////////////////
	/**
	 * Creat_CSV_check���������ɴ�����������ļ������𰸣�����ȷ�𰸣�
	 * ���룺50��ϰ������ArrayList<String[]> lstFile
	 * �������
	 * 
	 * */
	public void Creat_CSV_check (ArrayList<String[]> lstFile) {//������ϰ�ļ�
		CsvIO_Method f = new CsvIO_Method();
		
		String pathCSVWrite = "d:\\";
		String pathCSVWriter = pathCSVWrite+f.Retuen_Name2()+"check"+".csv";
		String address = f.Retuen_Name2()+"check"+".csv";//�ַ������� TABLE�����ĸ���
		try{
			CsvWriter csvWriter = new CsvWriter(pathCSVWriter,',',Charset.forName("gb2312"));
			// д��ͷ
			String[] csvHeader = {"���","��ʽ","��","�Դ�","��ȷ��"};
			
			csvWriter.writeRecord(csvHeader);
			 // д����
			for(int i=0;i<lstFile.size();i++){
				String[] csvContent = lstFile.get(i);
				if(csvContent[2].equals(csvContent[4])) {
					csvContent[3]="��";
				}
				else {
					csvContent[3]="��";
				}
				Framemain_final.lstFile.set(i, csvContent);
				System.out.println(csvContent[3]);
				csvWriter.writeRecord(csvContent);
			}
			csvWriter.close();
			System.out.println("--------------------����������ļ�д�����--------------");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	/////////////////////////�����ļ�///////////////////////////////////
	/**
	 * Reader_Book�����������ļ����������ֵ��벻ͬ���ļ���
	 * ���룺String name�ļ�����
	 * �����ArrayList<String[]> �ļ��ڵ���Ŀlist
	 * 
	 * */
	public ArrayList<String[]> Reader_Book (String name) {//���name������������
		String pathCSVWrite = "d:\\";
		String pathCSV = pathCSVWrite+name+".csv";
		ArrayList<String[]> lstFile = new ArrayList<String[]>();
		////////////////////////////////////��ȡ����///////////////////////////
		try {
			// ����CSV������ ����:CsvReader(�ļ�·�����ָ����������ʽ);
			CsvReader reader = new CsvReader(pathCSV,',',Charset.forName("gb2312"));
			  // ������ͷ �����Ҫ��ͷ�Ļ��������Ժ���
			reader.readHeaders();
			 // ���ж������ͷ������
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
		System.out.println("--------------------������ļ���Ϣ��ȡ����--------------");
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
