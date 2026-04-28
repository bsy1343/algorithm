# [Silver I] 가희는 그래플러야!! - 15916

[문제 링크](https://www.acmicpc.net/problem/15916)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1333, 정답: 468, 맞힌 사람: 360, 정답 비율: 34.221%

### 분류

수학, 기하학

### 문제 설명

<p>그래프와 관련된 문제입니다.</p>

<p>arr_y[0] = 0이라고 하고, arr_y[i] = yi라고 해 봅시다. (단 0&lt;i&lt;=n) 조가희는 아래와 같은 일을 수행해서, 구간 [0,n]에서 정의되는 함수 f(x)를 그렸습니다.</p>

<pre>
for(int i=1;i&lt;=n;i++)
    (i-1,arr[i-1].y)와 (i,arr[i].y)를 잇는 선분을 그립니다.</pre>

<p>예를 들어, n=2이고, arr_y[3]={0,3,2}라고 해 봅시다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/15916.%E2%80%85%EA%B0%80%ED%9D%AC%EB%8A%94%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%8C%EB%9F%AC%EC%95%BC!!/6158c128.png" data-original-src="https://upload.acmicpc.net/39f17cd5-2a6f-4dc1-9c68-b0ab7c22994c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><br />
&nbsp;</p>

<p>이 경우 함수 f(x)는 위 그림과 같이 그려질 겁니다. 조가희는 구간 [0,n]에서 정의되는 함수 y=f(x)와 y=kx가 (0,0) 말고 또 다른 점에서 만나는지 궁금해졌습니다. 여러분이 궁금증을 해결해 주세요.</p>

### 입력

<p style="margin:0cm 0cm 0.0001pt">첫 줄에 정수 n이 주어집니다. 두 번째 줄에 n개의 수가 주어집니다. 세 번째 줄에 k가 주어집니다. 1 &le; n &le; 10<sup>5</sup>이고, n을 제외한 나머지 수는 0보다 크거나 같고, 2<sup>30</sup>보다 작거나 같은 정수입니다.</p>

### 출력

<p>(0,0) 말고 또 다른 점에서 만나면 T를, 그렇지 않다면 F를 출력하세요.</p>