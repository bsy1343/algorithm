# [Platinum V] Tomosynthesis - 11206

[문제 링크](https://www.acmicpc.net/problem/11206)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 26, 정답: 4, 맞힌 사람: 4, 정답 비율: 28.571%

### 분류

브루트포스 알고리즘, 정렬, 기하학, 스위핑, 피타고라스 정리, 각도 정렬

### 문제 설명

<p>Tomosynthesis is a medical imaging modality in which a 3D dataset is obtained algorithmically from a set of X-ray images taken in different directions within a limited range of angles. A larger range of angles normally gives a better reconstruction, but is more difficult to acquire. Arvid is working on a reconstruction algorithm for obtaining the 3D image, but so far it doesn&rsquo;t seem to work when there are overlapping structures in any of the input images. The sample he will first reconstruct is a test object consisting of parallel equal-length cylinders of varying diameters that will be rotated around the axis of the cylinders.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11206.%E2%80%85Tomosynthesis/0a5545c2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11206.%E2%80%85Tomosynthesis/0a5545c2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11206/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:214px; width:324px" /></p>

<p style="text-align: center;">Figure D.1: To the left, a cross section of the test object of sample input 1. The upper projection is not acceptable since the two larger cylinders overlap. In the lower projection no cylinders overlap, so this direction and a range of angles around it are okay. To the right, an illustration of the same test object from the side.</p>

<p>Disregarding the fact that his algorithm will not work in practice, Arvid asks you for help. What is the largest range of angles in which the test object can be imaged without any cylinders overlapping in any of the images? An image is a plane projection of the structure perpendicular to the axes of the cylinders.</p>

### 입력

<p>The first line of input contains a single integer 2 &le; N &le; 100 denoting the number of cylinders that constitute the test object. This is followed by N rows, each containing three floating point numbers x, y and r, denoting the x- and y-coordinate of the center of a cylinder, and the radius of that cylinder, respectively. The coordinates are in the range &minus;1 000 &le; x, y &le; 1 000 and the radius 0 &lt; r &le; 1 000. None of the cylinders touch or overlap</p>

### 출력

<p>Output a single number, the size in radians of the largest continuous range of projection directions over which no cylinders overlap. If no such angle exists output 0. Your answer should have an absolute error of at most 10<sup>&minus;8</sup>.</p>