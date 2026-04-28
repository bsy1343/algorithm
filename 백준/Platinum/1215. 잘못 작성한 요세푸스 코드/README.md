# [Platinum IV] 잘못 작성한 요세푸스 코드 - 1215

[문제 링크](https://www.acmicpc.net/problem/1215)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 128 MB

### 통계

제출: 1624, 정답: 383, 맞힌 사람: 291, 정답 비율: 29.969%

### 분류

수학, 정수론

### 문제 설명

<p>요세푸스 문제는 아래와 같이 풀 수 있다.</p>

<pre class="brush:c++; toolbar:false;">
r := 0;
for i from 1 to n do
    r := (r + k) mod i;
return r;</pre>

<p>하지만 상근이는 코드를 잘못 읽고 아래와 같이 작성했다.</p>

<pre class="brush:c++; toolbar:false;">
r := 0;
for i from 1 to n do
    r := r + (k mod i);
return r;</pre>

<p>n과 k가 주어졌을 때, 상근이의 잘못 작성한&nbsp;소스를 실행시킨 결과를 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 줄에 n과 k가 주어진다. (1 &le; n, k &le; 10<sup>9</sup>)<br />
&nbsp;</p>

### 출력

<p>첫째 줄에 주어진 n과 k로 상근이의 잘못&nbsp;작성한 소스의 결과를 출력한다.</p>