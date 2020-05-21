package app.core.po;

/**
 * 线下课程学分聚合类
 * @author chen
 *
 */
public class CourseOnsiteCreditAggregation {
	private String xyzh;
	private Double xxkczxf;
	public String getXyzh() {
		return xyzh;
	}
	public void setXyzh(String xyzh) {
		this.xyzh = xyzh;
	}
	public Double getXxkczxf() {
		return xxkczxf;
	}
	public void setXxkczxf(Double xxkczxf) {
		this.xxkczxf = xxkczxf;
	}
	@Override
	public String toString() {
		return "CourseOnsiteCreditAggregation [xyzh=" + xyzh + ", xxkczxf=" + xxkczxf + "]";
	}
	
}
