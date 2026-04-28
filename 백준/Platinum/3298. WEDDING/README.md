# [Platinum V] WEDDING - 3298

[문제 링크](https://www.acmicpc.net/problem/3298)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 6, 맞힌 사람: 6, 정답 비율: 27.273%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 애드 혹, 해 구성하기, 덱

### 문제 설명

<p>Slavko is organizing a wedding for his friend Mirko.</p>

<p>The special feature of the wedding will be the popular dance called &quot;Train&quot;. All guests line up one behind the other, and everyone except the first person in the train puts his hands on shoulders of the person in front of him, and then they cheerfully dance through the hall, and sometimes even through the kitchen.</p>

<p>Slavko wants his train to look nice. If two people who are next to each other are of very different heights, then the train doesn&#39;t look nice.</p>

<p>Mirko&#39;s family is very conservative, and it isn&#39;t allowed that anywhere in the train in front of somebody from Mirko&#39;s family is some younger member of his family. The rest of the people can stand wherever they want.</p>

<p>Given are the heights of all the guests, and the order by age of Mirko&#39;s family. Write a program that will distribute the people in the train, so that not one member of Mirko&#39;s family has a younger member in front of him, and the sum of the differences of the heights between the neighbors in the train is minimal.</p>

### 입력

<p>In the first line of the input file are two integers N and K, divided by a comma, 1 &le; N &le; 10000, 1 &le; K &le; 1000, K &le; N, the total number of people on the wedding and the number of people from Mirko&#39;s family.</p>

<p>In the next N lines are an integer V, 1000 &le; V &le; 2200, the height of each guest. The guests are marked with numbers 1 to N, and the first K guests are members of Mirko&#39;s family, sorted by age descending (so the guest number 1 is the oldest member of Mirko&#39;s family, and guest K is the youngest).</p>

### 출력

<p>Write the minimum sum of differences in the first line.</p>

<p>In the next N lines write the markings of the guests in order in which they appear in the optimal train, from the beginning to the end.</p>

<p>Note: solution doesn&#39;t have to be unique.</p>