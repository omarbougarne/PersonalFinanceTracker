package com.finance.tracker;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
	
	BigDecimal amount;
	String description;
	Date date;
	
	
	public enum Category {
	    FOOD,
	    TRANSPORT,
	    UTILITIES
	}

	public enum Type {
	    INCOME,
	    EXPENSE
	}
	
	Category category;
	Type type;
	
	public Transaction(BigDecimal amount, String description, Date date, Category category, Type type) {
	    this.amount = amount;
	    this.description = description;
	    this.date = date;
	    this.category = category;
	    this.type = type;
	}
	
	
}
