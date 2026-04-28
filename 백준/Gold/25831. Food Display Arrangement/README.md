# [Gold V] Food Display Arrangement - 25831

[문제 링크](https://www.acmicpc.net/problem/25831)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 13, 맞힌 사람: 13, 정답 비율: 76.471%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 집합과 맵

### 문제 설명

<p>Your friend, Thomas, is working on Food Display Arrangements (FDA). He has all the food lined up on a long row (table). His job requires that he arranges the FDA in an aesthetically pleasing manner. An FDA is aesthetically pleasing if all the food of the same type is grouped together, i.e., all the food of the same type are next to each other. Thomas can reorganize the FDA as follows: pick up all the food of one type and place it on either end of the table, i.e., place it at the beginning of the table or at the end of the table. Thomas wants to know the minimum number of reorganization steps needed to make the FDA aesthetically pleasing. Note that you don&rsquo;t need to tell him the specific steps, only the least number of steps.</p>

<p>Given a display of food by their types, determine the minimum number of times necessary to move all food of the same type to the end or the beginning of the display to ensure that all food of the same type is grouped together. Assume that the display can be extended at the ends to contain any amount of moved food.</p>

### 입력

<p>The first input line contains an integer, n (1 &le; n &le; 100,000), representing the number of food items in the display. The next input line contains n space separated integers, a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 1,000,000,000), representing the id of the i th food item in the display.</p>

### 출력

<p>Print the minimum number of times necessary to move all food of the same type to the beginning or the end to make the FDA aesthetically pleasing.</p>

### 힌트

<p>Explanation of the first Sample Input/Output: We can move all food of type 2 to either end and all food of type 7 to either end, for a total of 2 moves.</p>