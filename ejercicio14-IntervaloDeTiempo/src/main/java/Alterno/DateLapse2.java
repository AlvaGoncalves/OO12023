package Alterno;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse2 implements Date {
	private LocalDate from;
	private LocalDate to;
	
	
	@Override
	public LocalDate getFrom() {
		return this.from;
	}

	@Override
	public LocalDate getTo() {
		return this.to;
	}

	@Override
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from, to);
	}

	@Override
	public boolean includesDate(LocalDate other) {
		return getFrom().isBefore(other) && getTo().isAfter(other);
	}

}
