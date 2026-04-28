# [Platinum I] Spies - 7987

[문제 링크](https://www.acmicpc.net/problem/7987)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 171, 정답: 59, 맞힌 사람: 42, 정답 비율: 33.333%

### 분류

그래프 이론, 그리디 알고리즘

### 문제 설명

<p>Byteotian Intelligence Agency (BIA) employs many spies. Each of them has duty to shadow exactly one other spy.</p>

<p>King Byteasar wants to entrust as many agents as possible with a top secret operation. However, the operation is so important that each spy taking part has to be traced by at least one agent not involved in the operation (assignment of shadowing BIA spies does not change).</p>

<p>Write a programme that:</p>

<ul>
	<li>reads from standard input the description of whom each spy shadows,</li>
	<li>calculates how many agents can be assigned to the operation in a way that each of them would be spied by at least one agent not taking part in the operation,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the input there is one positive integer written, n - the number of spies, 2 &le; n &le; 1,000,000. The spies are numbered from 1 to n. In the following n lines there is a description of whom each agent spies. Each of these lines contains one positive integer. A number a<sub>k</sub>&nbsp;situated in line no. k+1 indicates, that the spy no. k shadows the spy no. ak, 1 &le; k &le; n, 1 &le; a<sub>k</sub> &le; n, a<sub>k</sub>&ne;k.</p>

### 출력

<p>Your programme should write one integer in the first line of the output - the maximal number of spies that can be assigned to the secret operation.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7987.%E2%80%85Spies/1b88e972.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7987.%E2%80%85Spies/1b88e972.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7987/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:168px; width:251px" /></p>