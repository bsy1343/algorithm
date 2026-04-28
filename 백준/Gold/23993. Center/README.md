# [Gold II] Center - 23993

[문제 링크](https://www.acmicpc.net/problem/23993)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

(분류 없음)

### 문제 설명

<p>There are&nbsp;<b>N</b>&nbsp;weighted points in a plane. Point&nbsp;<b>i</b>&nbsp;is at (<b>X<sub>i</sub></b>,&nbsp;<b>Y<sub>i</sub></b>) and has weight&nbsp;<b>W<sub>i</sub></b>.</p>

<p>In this problem, we need to find a special center of these points. The center is a point (<b>X</b>,&nbsp;<b>Y</b>) such that the sum of max(|<b>X</b>-<b>X<sub>i</sub></b>|, |<b>Y</b>-<b>Y<sub>i</sub></b>|)*<b>W<sub>i</sub></b>&nbsp;is minimum.</p>

### 입력

<p>The input starts with one line containing exactly one integer&nbsp;<b>T</b>, which is the number of test cases.&nbsp;<b>T</b>&nbsp;test cases follow.</p>

<p>Each test case begins with one line containing one integer&nbsp;<b>N</b>.&nbsp;<b>N</b>&nbsp;lines follow. Each line contains three space-separated real numbers&nbsp;<b>X<sub>i</sub></b>,&nbsp;<b>Y<sub>i</sub></b>, and&nbsp;<b>W<sub>i</sub></b>.&nbsp;<b>X<sub>i</sub></b>,&nbsp;<b>Y<sub>i</sub></b>&nbsp;and&nbsp;<b>W<sub>i</sub></b>&nbsp;have exactly 2 digits after the decimal point.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the sum of max(|<b>X</b>-<b>X<sub>i</sub></b>|, |<b>Y</b>-<b>Y<sub>i</sub></b>|)*<b>W<sub>i</sub></b>&nbsp;for center (<b>X</b>,&nbsp;<b>Y</b>).</p>

<p><code>y</code>&nbsp;will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 10.</li>
	<li>-1000.00 &le;&nbsp;<b>X<sub>i</sub></b>&nbsp;&le; 1000.00.</li>
	<li>-1000.00 &le;&nbsp;<b>Y<sub>i</sub></b>&nbsp;&le; 1000.00.</li>
</ul>