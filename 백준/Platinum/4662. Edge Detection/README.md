# [Platinum IV] Edge Detection - 4662

[문제 링크](https://www.acmicpc.net/problem/4662)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

이분 탐색, 자료 구조, 그리디 알고리즘, 해시를 사용한 집합과 맵, 구현, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>IONU Satellite Imaging, Inc. records and stores very large images using run length encoding. You are to write a program that reads a compressed image, finds the edges in the image, as described below, and outputs another compressed image of the detected edges.</p>

<p>A simple edge detection algorithm sets an output pixel&#39;s value to be the maximum absolute value of the differences between it and all its surrounding pixels in the input image. Consider the input image below:</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:200px">
	<tbody>
		<tr>
			<td style="text-align: center;">15</td>
			<td style="text-align: center;">15</td>
			<td style="text-align: center;">15</td>
			<td style="text-align: center;">15</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
		</tr>
		<tr>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
		</tr>
		<tr>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">100</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">25</td>
		</tr>
		<tr>
			<td style="text-align: center;">175</td>
			<td style="text-align: center;">175</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">25</td>
		</tr>
		<tr>
			<td style="text-align: center;">175</td>
			<td style="text-align: center;">175</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">25</td>
		</tr>
	</tbody>
</table>

<p>Input image</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:200px">
	<tbody>
		<tr>
			<td style="text-align: center;">85</td>
			<td style="text-align: center;">85</td>
			<td style="text-align: center;">85</td>
			<td style="text-align: center;">85</td>
			<td style="text-align: center;">85</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">0</td>
		</tr>
		<tr>
			<td style="text-align: center;">85</td>
			<td style="text-align: center;">85</td>
			<td style="text-align: center;">85</td>
			<td style="text-align: center;">85</td>
			<td style="text-align: center;">85</td>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">75</td>
		</tr>
		<tr>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">75</td>
		</tr>
		<tr>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">150</td>
			<td style="text-align: center;">150</td>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">0</td>
		</tr>
		<tr>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">150</td>
			<td style="text-align: center;">150</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">0</td>
		</tr>
	</tbody>
</table>

<p>Output image</p>

<p>The upper left pixel in the output image is the maximum of the values |15-15|, |15-100|, and |15-100|, which is 85. The pixel in the 4th row, 2nd column is computed as the maximum of |175-100|, |175-100|, |175-100|, |175-175|, |175-25|, |175-175|, |175-175|, and |175-25|, which is 150.</p>

<p>Images contain 2 to 1,000,000,000 (10<sup>9</sup>) pixels. All images are encoded using run length encoding (RLE). This is a sequence of pairs, containing pixel value (0-255) and run length (1-10<sup>9</sup>). Input images have at most 1,000 of these pairs. Successive pairs have different pixel values. All lines in an image contain the same number of pixels.</p>

### 입력

<p>Input consists of information for one or more images. Each image starts with the width, in pixels, of each image line. This is followed by the RLE pairs, one pair per line. A line with 0 0 indicates the end of the data for that image. An image width of 0 indicates there are no more images to process. The first image in the example input encodes the 5x7 input image above.</p>

### 출력

<p>Output is a series of edge-detected images, in the same format as the input images, except that there may be more than 1,000 RLE pairs.</p>

### 힌트

<p>A brute force solution that attempts to compute an output value for every individual pixel will likely fail due to space or time constraints.</p>