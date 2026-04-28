# [Silver V] Bags - 17599

[문제 링크](https://www.acmicpc.net/problem/17599)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 340, 정답: 254, 맞힌 사람: 213, 정답 비율: 78.598%

### 분류

자료 구조, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Your friend Bob is a garbage collector working in a factory. The factory manufactures various kinds of chemical substances, and the toxic waste they may produce must be collected with caution. Every piece of toxic waste has an identifier that represents its chemical composition. It is very dangerous to put two pieces of toxic waste with different identifiers into a garbage bag, since they might produce some chemical reactions that lead to explosion, fire, toxic smoke or other chemical hazards.</p>

<p>Today, Bob has to collect n very small pieces of toxic waste, and their identifiers are a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>, respectively. These pieces are small enough to fit in one garbage bag, but Bob might as well use more bags to avoid any potential hazard. Please write a program to help Bob to calculate the minimum number of garbage bags required to safely collect all n pieces of toxic waste.</p>

### 입력

<p>The first line of the input contains one integer n where n is the number of pieces of toxic wastes. The second line of the input contains n positive integers a<sub>1</sub>, . . . , a<sub>n</sub> which are the identifiers associated with the corresponding pieces.</p>

### 출력

<p>Output the answer in a line.</p>

### 제한

<ul>
	<li>2 &le; n &le; 10<sup>5</sup>, and a<sub>1</sub>, . . . , a<sub>n</sub> are positive integers at most 10<sup>9</sup>.</li>
</ul>