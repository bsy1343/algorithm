# [Platinum V] blobsad - 24502

[문제 링크](https://www.acmicpc.net/problem/24502)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 605, 정답: 216, 맞힌 사람: 178, 정답 비율: 35.600%

### 분류

그리디 알고리즘

### 문제 설명

<p>연구소에 동거하는 채완이와 주환이는 블롭을 아주 좋아한다. 그래서 둘은 연구소에서 블롭을&nbsp;키운다.</p>

<p>둘은 $1 \times 1$ 크기의 정사각형 $N$개로 나누어진 $1 \times N$ 크기의 직사각형 통 안에&nbsp;블롭을 키우고&nbsp;있으며, $i$번째 $1 \times 1$&nbsp;정사각형에는 블롭&nbsp;$A_i$마리를 키운다.</p>

<p>그런데 어느 날, 채완이와 주환이는 블롭들이 슬퍼한다는&nbsp;사실을&nbsp;알아차렸다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24502.%E2%80%85blobsad/7acd2bd8.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24502.%E2%80%85blobsad/7acd2bd8.png" data-original-src="https://upload.acmicpc.net/4a772502-bd84-4a45-b00c-7b225a7f03da/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 384px;" /><br />
&nbsp;</p>

<p>연구 끝에&nbsp;블롭은 같은&nbsp;칸에 있는 블롭의 수가 $K$의 배수가 아니면&nbsp;슬퍼한다는 사실을&nbsp;알 수 있었고,&nbsp;통에 있는 블롭을 적절히 옮겨&nbsp;슬퍼하지 않게 만들려고 한다.</p>

<p>그러나 $1$초마다&nbsp;하나의 블롭만&nbsp;옮길&nbsp;수 있으며, 블롭은 여러 칸을 한번에 움직이는 것을 싫어하기 때문에 인접한 칸으로만 옮길 수 있다. 채완이와 주환이는 할 일이 많이 있기에 최대한 빠르게 블롭을&nbsp;옮기는 일을 해결하려고 한다.</p>

<p>채완이와 주환이를 위해 블롭을&nbsp;옮기는 일을 마칠 수 있는 최소 시간을 구해주자.</p>

### 입력

<p>첫째 줄에 $N$과 $K$가 공백으로 구분되어 주어진다.</p>

<p>둘째 줄에 $1 \times 1$ 정사각형에 들어가 있는 블롭의 수 $A_1, A_2, \cdots, A_N$이&nbsp;공백으로 구분되어 주어진다.</p>

### 출력

<p>채완이와 주환이가 이 일을 마칠&nbsp;수 있는 최소 시간을 초 단위로 출력한다. 만약, 마칠 수&nbsp;없다면 <code>blobsad</code>를 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N \le 10^6$</li>
	<li>$1 \le K \le 10^9$</li>
	<li>$1 \le A_i \le 10^9$ $(1 \le&nbsp;i \le&nbsp;N)$</li>
</ul>