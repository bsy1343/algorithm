# [Gold III] blobaww - 24501

[문제 링크](https://www.acmicpc.net/problem/24501)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 1263, 정답: 365, 맞힌 사람: 299, 정답 비율: 27.970%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>블롭 세계에는 이러한 전설이&nbsp;있다.</p>

<blockquote>
<p>100년 전, 천재 인간 채완이는 에너지를 글자 세 개로 저장할 수 있고, 자신이 원하는 형태로 바꿔 쓸 수 있는 &quot;ENERGY SYNERGY MATRIX&quot;를 개발하였다. 이후 블롭 세계의 블롭들은&nbsp;에너지를 원하는 형태로 자유롭게 쓸 수 있게 되었고, 블롭 세계는 에너지 기술에서 엄청난 발전을 이룩하게 되었다.</p>
</blockquote>

<p>$ESM$을 오늘 알게 된 블롭&nbsp;주환이는 이 전설을&nbsp;듣고 놀라 자신이 구경하던 ENERGY SYNERGY MATRIX를 살펴보았다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24501.%E2%80%85blobaww/45ce309a.png" data-original-src="https://boja.mercury.kr/assets/problem/24501-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24501.%E2%80%85blobaww/a04a5a94.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/24501.%E2%80%85blobaww/a04a5a94.png" data-original-src="https://upload.acmicpc.net/5935104c-92f4-47f7-825e-97c8c9b2f1ad/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>&quot;ENERGY SYNERGY MATRIX&quot;는 문자 <code>E</code>, <code>S</code>, <code>M</code>으로 구성된&nbsp;$N&times;M$ 크기의&nbsp;2차원 행렬이다. 이를 줄여서 $ESM$이라고 하자.</p>

<p>주환이는&nbsp;$ESM$을 켜려고 한다. $ESM$은 $ESM_{x1, y1} =$ <code>E</code>, $ESM_{x2, y2} =$ <code>S</code>, $ESM_{x3, y3} =$ <code>M</code> ($1 \leq x1 \leq x2 \leq x3 \leq&nbsp;N, 1 \leq y1 \leq y2 \leq y3 \leq&nbsp;M$)인 임의의 세 칸 $(x1, y1)$, $(x2, y2)$, $(x3, y3)$을 차례로 누르면 켜진다.</p>

<p>주환이는 $ESM$을 켤 수 있는 경우의 수가 궁금해졌다. 주환이를 도와 경우의 수를 구해 주자.</p>

<p>경우의 수가 커질 수 있으므로&nbsp;$10^9+7$로 나눈 나머지를 출력한다.</p>

### 입력

<p>첫째 줄에 $N$과 $M$이 공백으로 구분되어 주어진다.</p>

<p>다음 $N$개의 줄에 걸쳐, 각 줄마다 $M$개의 문자가 공백 없이 주어진다.</p>

### 출력

<p>주환이가 조건에 맞게 고를 수 있는&nbsp;경우의 수를 $10^9+7$로 나눈 나머지를 출력한다.</p>

### 제한

<ul>
	<li>$1 \leq N, M \leq 3\,000$</li>
	<li>모든 $i, j$ $(1 \leq i&nbsp;\leq&nbsp;N, 1&nbsp;\leq j \leq&nbsp;M)$에 대해서&nbsp;$ESM_{i, j}$은 <code>E</code>, <code>S</code>, <code>M</code> 중 하나이다.</li>
</ul>