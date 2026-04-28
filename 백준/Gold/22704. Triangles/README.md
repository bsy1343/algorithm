# [Gold II] Triangles - 22704

[문제 링크](https://www.acmicpc.net/problem/22704)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 13, 맞힌 사람: 12, 정답 비율: 75.000%

### 분류

수학, 기하학

### 문제 설명

<p>There is a group that paints an emblem on the ground to invite aliens every year. You are a member of this group and you have to paint the emblem this year.</p>

<p>The shape of the emblem is described as follows. It is made of&nbsp;<i>n</i>&nbsp;regular triangles whose sides are equally one unit length long. These triangles are placed so that their centroids coincide, and each of them is rotated counterclockwise by 360/<i>n</i>&nbsp;degrees with respect to the one over it around its centroid. The direction of the top triangle is not taken into account.</p>

<p>It is believed that emblems have more impact as their&nbsp;<i>n</i>&nbsp;are taken larger. So you want to paint the emblem of&nbsp;<i>n</i>&nbsp;as large as possible, but you don&rsquo;t have so much chemicals to paint. Your task is to write a program which outputs the area of the emblem for given&nbsp;<i>n</i>&nbsp;so that you can estimate the amount of the needed chemicals.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/30a38814-e285-4fe3-be08-840ec445a715/-/preview/" style="width: 203px; height: 205px;" /></p>

<p style="text-align: center;">Figure 1: The Emblem for&nbsp;<i>n</i>&nbsp;= 2</p>

### 입력

<p>The input data is made of a number of data sets. Each data set is made of one line which contains an integer&nbsp;<i>n</i>&nbsp;between 1 and 1000 inclusive.</p>

<p>The input is terminated by a line with&nbsp;<i>n</i>&nbsp;= 0. This line should not be processed.</p>

### 출력

<p>For each data set, output the area of the emblem on one line. Your program may output an arbitrary number of digits after the decimal point. However, the error should be 10<sup>-6</sup>&nbsp;( = 0.000001) or less.</p>