# [Gold IV] Skyscrapers - 7882

[문제 링크](https://www.acmicpc.net/problem/7882)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 110, 정답: 45, 맞힌 사람: 34, 정답 비율: 47.222%

### 분류

구현, 정렬

### 문제 설명

<p>In a seaside village, there is an avenue of skyscrapers. Each skyscrapers is 100m wide and has certain height. Due to very high price of parcels, any two consecutive skyscrapers are adjacent. The avenue lies close to the beach so the street is exactly at the sea level.</p>

<p>Unfortunately, this year, due to the global warming, the sea level started to increase by one meter each day. If the skyscraper height is no greater than the current sea level, it is considered flooded. A region is a maximal set of non-flooded, adjacent skyscrapers. This term is of particular importance, as it is sufficient to deliver goods (like current, carrots or cabbages) to any single skyscraper in each region. Hence, the city major wants to know how many regions there will be in the hard days that come.</p>

<p>An example of an avenue with 5 skyscrapers after 2 days is given below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7882.%E2%80%85Skyscrapers/7c3df868.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7882/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:114px; width:278px" /></p>

### 입력

<p>The input contains several test cases. The first line contains an integer t (t &le; 15) denoting the number of test cases. Then t test cases follow. Each of them begins with a line containing two numbers n and d (1 &le; n, d &le; 10<sup>6</sup>), n is the number of skyscrapers and d is the number of days which the major wants to query. Skyscrapers are numbered from left to right. The next line contains n integers h<sub>1</sub>, h<sub>2</sub>, . . . , h<sub>n</sub> where 1 &le; h<sub>i</sub> &le; 10<sup>9</sup> is the height of skyscraper i. The third line of a single test case contains d numbers t<sub>j</sub> such that 0 &le; t<sub>1</sub> &lt; t<sub>2</sub> &lt; . . . &lt; t<sub>d&minus;1</sub> &lt; t<sub>d</sub> &le; 10<sup>9</sup>.</p>

### 출력

<p>For each test case output d numbers r<sub>1</sub>, r<sub>2</sub>, . . . , r<sub>d</sub>, where r<sub>j</sub> is the number of regions on day t<sub>j</sub>.</p>