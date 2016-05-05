package jfreechartraining;

import java.awt.BasicStroke;
import java.awt.Color;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

public class JFCMainRunning {

    public static void main(String[] args) {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
	String itemA = "First";
	defaultCategoryDataset.addValue(1000.0D, itemA, "05-01");
	defaultCategoryDataset.addValue(1030.3D, itemA, "05-02");
	defaultCategoryDataset.addValue(1400.0D, itemA, "05-03");
	defaultCategoryDataset.addValue(1500.0D, itemA, "05-04");
	defaultCategoryDataset.addValue(1600.0D, itemA, "05-05");
	defaultCategoryDataset.addValue(1200.0D, itemA, "05-06");
	defaultCategoryDataset.addValue(1500.0D, itemA, "05-07");
	
	String itemB="Second";
	defaultCategoryDataset.addValue(900.0D, itemB, "05-01");
	defaultCategoryDataset.addValue(830.3D, itemB, "05-02");
	defaultCategoryDataset.addValue(700.0D, itemB, "05-03");
	defaultCategoryDataset.addValue(600.0D, itemB, "05-04");
	defaultCategoryDataset.addValue(400.0D, itemB, "05-05");
	defaultCategoryDataset.addValue(700.0D, itemB, "05-06");
	defaultCategoryDataset.addValue(600.0D, itemB, "05-07");
	
	String itemC="Thrid";
	defaultCategoryDataset.addValue(100.0D, itemC, "05-01");
	defaultCategoryDataset.addValue(230.3D, itemC, "05-02");
	defaultCategoryDataset.addValue(300.0D, itemC, "05-03");
	defaultCategoryDataset.addValue(200.0D, itemC, "05-04");
	defaultCategoryDataset.addValue(400.0D, itemC, "05-05");
	defaultCategoryDataset.addValue(500.0D, itemC, "05-06");
	defaultCategoryDataset.addValue(100.0D, itemC, "05-07");
	
	//创建主题样式  
        StandardChartTheme mChartTheme = new StandardChartTheme("CN");  
        //设置标题字体  
        mChartTheme.setExtraLargeFont(new Font("黑体", Font.BOLD, 20));  
        //设置轴向字体  
        mChartTheme.setLargeFont(new Font("宋体", Font.CENTER_BASELINE, 15));  
        //设置图例字体  
        mChartTheme.setRegularFont(new Font("宋体", Font.CENTER_BASELINE, 15));  
        //应用主题样式  
        ChartFactory.setChartTheme(mChartTheme); 

	JFreeChart jFreeChart = ChartFactory.createLineChart("DAU测试中文", "Type中文", null,
		defaultCategoryDataset, PlotOrientation.VERTICAL, true, true, false);

	
	CategoryPlot categoryPlot = jFreeChart.getCategoryPlot();
	categoryPlot.setBackgroundPaint(Color.white);
	categoryPlot.setRangeGridlinesVisible(true);//绘制标准线
	categoryPlot.setRangeGridlinePaint(Color.black);

	CategoryAxis categoryAxis = categoryPlot.getDomainAxis();
	categoryAxis.setAxisLineStroke(new BasicStroke(2.0f));// 设置轴的粗细

	LineAndShapeRenderer lineAndShapeRenderer = (LineAndShapeRenderer) categoryPlot
		.getRenderer();
	lineAndShapeRenderer.setBaseShapesVisible(true);// 设置节点是否显示

	lineAndShapeRenderer.setDrawOutlines(true);
	lineAndShapeRenderer.setUseFillPaint(true);
	lineAndShapeRenderer.setBaseItemLabelsVisible(true);
	lineAndShapeRenderer.setStroke(new BasicStroke(3.0f));// 设置折线的粗细
	lineAndShapeRenderer.setBaseItemLabelsVisible(true);
	lineAndShapeRenderer.setBasePositiveItemLabelPosition(
		new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_CENTER));
	lineAndShapeRenderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());

	ChartFrame chartFrame = new ChartFrame("标题", jFreeChart, true);
	chartFrame.pack();
	chartFrame.setVisible(true);
	
	try( FileOutputStream fos = new FileOutputStream("pic1.jpg")){
	    Thread.sleep(1000);
	    if(chartFrame.isActive()){
		ChartUtilities.writeChartAsJPEG(fos, 1.0f, jFreeChart, 800, 480);
	    }
	} catch (IOException e)
	{
	    e.printStackTrace();
	} catch (InterruptedException e)
	{
	    e.printStackTrace();
	}
    }

}
