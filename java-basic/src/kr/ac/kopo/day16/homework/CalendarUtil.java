package kr.ac.kopo.day16.homework;

	import java.util.Calendar;

	public class CalendarUtil {

		public void showByYear(int year) {
			
			for(int month = 1; month <= 12; month++) {
				showByMonth(year, month);
			}		
		}
		
		public void showByMonth(int year, int month) {
			System.out.println("< " + year + "�� " + month + "�� >");

			Calendar c = Calendar.getInstance();
			// yyyy-mm-01 ����
			c.set(year, month-1, 1);
			
			// 1���� ����???
			int week = c.get(Calendar.DAY_OF_WEEK);	// 1(��) ~ 7(��)
			
			// month�� ��������???
			int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			showByDay(week, lastday);
		}
		
		private void showByDay(int week, int lastday) {
			
			System.out.println("---------------------------------------------------");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			System.out.println("---------------------------------------------------");
			int cnt = 0;
			for(int i = 1; i < week; i++) {
				System.out.print("\t");
				cnt++;
			}
			for(int day = 1; day <= lastday; day++) {
				System.out.print(day + "\t");
				if(++cnt % 7 == 0) {
					System.out.println();
				}
			}
			if(cnt % 7 != 0)
				System.out.println();
			System.out.println("---------------------------------------------------");
		}
	}

