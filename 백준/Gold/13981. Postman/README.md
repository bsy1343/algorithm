# [Gold II] Postman - 13981

[문제 링크](https://www.acmicpc.net/problem/13981)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 122, 정답: 63, 맞힌 사람: 54, 정답 비율: 51.923%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>A postman delivers letters to his neighbors in a one-dimensional world.</p>

<p>The post office, which contains all of the letters to begin with, is located at x = 0, and there are n houses to which the postman needs to deliver the letters. House i is located at position x<sub>i </sub>, and there are m<sub>i</sub> letters that need to be delivered to this location. But the postman can only carry k letters at once.</p>

<p>The postman must start at the post office, pick up some number of letters less than or equal to his carrying capacity, and then travel to some of the houses dropping off letters. He must then return to the post office, repeating this process until all letters are delivered. At the end he must return to the post office.</p>

<p>The postman can travel one unit of distance in one unit of time.</p>

<p>What is the minimum amount of time it will take the postman to start at the post office, deliver all the letters, and return to the post office?</p>

### 입력

<p>The first line of input contains two space-separated integers n (1 &le; n &le; 1,000) and k (1 &le; k &le; 10<sup>7</sup> ).</p>

<p>Each of the next n lines contains two space-separated integers x<sub>i</sub> (|x<sub>i</sub>| &le; 10<sup>7</sup>) and mi (1 &le; m<sub>i</sub> &le; 10<sup>7</sup> ).</p>

### 출력

<p>Print, on a single line, the minimum amount of time it will take to complete the mail delivery route.</p>