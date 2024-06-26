package kr.ac.kopo.day16.homework;

	import java.util.Calendar;

	public class CalendarUtil {

		public void showByYear(int year) {
			
			for(int month = 1; month <= 12; month++) {
				showByMonth(year, month);
			}		
		}
		
		public void showByMonth(int year, int month) {
			System.out.println("< " + year + "년 " + month + "월 >");

			Calendar c = Calendar.getInstance();
			// yyyy-mm-01 변경
			c.set(year, month-1, 1);
			
			// 1일의 요일???
			int week = c.get(Calendar.DAY_OF_WEEK);	// 1(일) ~ 7(토)
			
			// month의 마지막날???
			int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			showByDay(week, lastday);
		}
		
		private void showByDay(int week, int lastday) {
			
			System.out.println("---------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
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

