package sg.edu.rp.c346.basicmathformula;

public class basicMathFormula {

        private String RectangleArea;
        private String TriangleArea;
        private String CubeArea;

        public basicMathFormula(String RectangleArea, String TriangleArea, String CubeArea){
            this.RectangleArea = RectangleArea;
            this.TriangleArea = TriangleArea;
            this.CubeArea = CubeArea;
        }

        public String getRectangleArea() {
            return RectangleArea;
        }

        public void setRectangleArea(String rectangleArea){
            this.RectangleArea=RectangleArea;
        }

        public String getTriangleArea() {
            return TriangleArea;
        }

        public void setTriangleArea(String triangleArea){
            this.TriangleArea = TriangleArea;
        }

        public String getCubeArea() {
            return CubeArea;
        }

        public void setCubeArea(String cubeArea) {
            this.CubeArea = cubeArea;
        }

        @Override
        public String toString() {
            return "basicMathFormula{" + "rectangleArea='" + RectangleArea + '\'' + ", triangleArea='" + TriangleArea + '\'' + ", cubeArea='" + CubeArea + '\'' + '}';
        }
    }


