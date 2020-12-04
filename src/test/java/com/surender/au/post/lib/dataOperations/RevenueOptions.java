package com.surender.au.post.lib.dataOperations;

public enum RevenueOptions {
    Starting("None, I'm just getting started"),
    LessThan100k("Less than $100,000"),
    From100To250k("$100,000 to $250,000"),
    From250To500k("$250,000 to $500,000"),
    From500kTo1m("$500,000 to $1,000,000"),
    From1mto5m("$1,000,000 to $5,000,000"),
    MoreThan5m("More than $5,000,000");

    public final String label;

    private RevenueOptions(String label){
        this.label = label;
    }
}
