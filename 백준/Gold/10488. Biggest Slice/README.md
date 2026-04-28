# [Gold II] Biggest Slice - 10488

[문제 링크](https://www.acmicpc.net/problem/10488)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 86, 정답: 22, 맞힌 사람: 22, 정답 비율: 27.500%

### 분류

수학, 정렬, 기하학

### 문제 설명

<p>You are sharing a large, circular pizza with n &minus; 1 of your friends. Your technique for slicing the pizza is shown in Figure 1; you rotate the pizza clockwise about its center by angle &theta;, and then you make a slice from the center of the pizza straight to the right. You repeat this process, rotating by the same angle &theta; and slicing to the right until you have done it a total of n times.</p>

<p style="text-align:center"><img alt="" src="/upload/images2/pizza.png" style="height:257px; width:283px" /></p>

<p style="text-align:center">Figure 1: Rotate-and-slice pizza division technique.</p>

<p>Of course, this isn&rsquo;t really a good way to divide a pizza (unless &theta; is well-chosen). Some of the resulting slices may be larger than others, and you may not even end up with n different slices. You don&rsquo;t care so much about fairness. You just want to know how big the largest slice will be, so you can take it for yourself.</p>

### 입력

<p>Input begins with an integer 1 &le; m &le; 200 indicating the number of test cases that follow. The following m lines each contain one test case. Each test case gives the pizza radius in centimeters, r, followed by the number of people sharing the pizza, n, followed by the rotation angle, &theta;. The quantities r, n and &theta; are all positive. The value r is an integer no greater than 100, and n is an integer no greater than 10<sup>8</sup>. The angle &theta; is given as an integer number of degrees, followed by an integer number of minutes and an integer number of seconds. Degrees are between 0 and 359 (inclusive), while minutes and seconds are between 0 and 59 (inclusive).</p>

### 출력

<p>For each test case, print the area in square centimeters of the largest resulting slice of pizza. You do not need to worry about the precise formatting of the answer (e.g. number of places past the decimal), but the absolute error of your output must be smaller than 10<sup>&minus;4</sup>.</p>