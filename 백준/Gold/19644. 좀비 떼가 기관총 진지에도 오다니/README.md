# [Gold III] 좀비 떼가 기관총 진지에도 오다니 - 19644

[문제 링크](https://www.acmicpc.net/problem/19644)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 3627, 정답: 893, 맞힌 사람: 600, 정답 비율: 24.010%

### 분류

자료 구조, 그리디 알고리즘, 누적 합, 큐

### 문제 설명

<p>킬로와 헥토는 좀비 떼로부터 탄약고를 사수하는 데에 성공했다. 포상 휴가나 조기 전역을 기대했으나 좀비 사태로 인해 계엄령이 선포되면서 오히려 전역이 연기되고 기관총 진지에 배치되었다.</p>

<p>전역이 연기된 킬로와 헥토에게 좀비 떼가 다가오기 시작했다.</p>

<p>기관총 진지 앞쪽 길의 거리는&nbsp;<em>L</em> m이며, 진지로부터 <em>i</em> m 떨어진 곳에 있는 좀비의 체력은&nbsp;<em>Z<sub>i</sub></em>이다.&nbsp;체력이 0 이하가 된 좀비는 영구적으로 죽는다.</p>

<p>기관총 진지에서 킬로와 헥토는 좀비가 1 m 이동할 때 기관총 또는 수평 세열 지향성 지뢰를 한 번 사용할 수 있다. 수평 세열 지향성 지뢰를 격발하는 경우 후폭풍을 피하기 위해 킬로와 헥토는 기관총 진지 밑으로 숨어야 한다. 즉, 수평 세열 지향성 지뢰 격발과 기관총 사격을 동시에 할 수는 없다.</p>

<ul>
	<li>기관총</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/19644.%E2%80%85%EC%A2%80%EB%B9%84%E2%80%85%EB%96%BC%EA%B0%80%E2%80%85%EA%B8%B0%EA%B4%80%EC%B4%9D%E2%80%85%EC%A7%84%EC%A7%80%EC%97%90%EB%8F%84%E2%80%85%EC%98%A4%EB%8B%A4%EB%8B%88/fbfda2b0.png" data-original-src="https://upload.acmicpc.net/fe32a3a9-5f9c-4b34-9d12-a968c00b6f49/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/19644.%E2%80%85%EC%A2%80%EB%B9%84%E2%80%85%EB%96%BC%EA%B0%80%E2%80%85%EA%B8%B0%EA%B4%80%EC%B4%9D%E2%80%85%EC%A7%84%EC%A7%80%EC%97%90%EB%8F%84%E2%80%85%EC%98%A4%EB%8B%A4%EB%8B%88/0291d8d8.png" data-original-src="https://upload.acmicpc.net/3c44c5e1-4270-4a75-b4ba-cb059831e552/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>유효 사거리는 진지 앞으로부터&nbsp;<em>M<sub>L</sub></em> m이다. 유효 사거리 내의 각 1 m 마다 좀비의 체력을&nbsp;<em>M<sub>K</sub></em>만큼 낮춘다.&nbsp;</p>

<p>기관총 탄약은 엄청나게 많이 있으므로 신경쓰지 않아도 된다. 총열 교체나 장전, 총기 이상&nbsp;등을&nbsp;고려할&nbsp;필요 없이 계속 사격할 수 있다고 가정한다.</p>

<ul>
	<li>수평 세열 지향성 지뢰</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/19644.%E2%80%85%EC%A2%80%EB%B9%84%E2%80%85%EB%96%BC%EA%B0%80%E2%80%85%EA%B8%B0%EA%B4%80%EC%B4%9D%E2%80%85%EC%A7%84%EC%A7%80%EC%97%90%EB%8F%84%E2%80%85%EC%98%A4%EB%8B%A4%EB%8B%88/91752977.png" data-original-src="https://upload.acmicpc.net/228ad3ee-f06a-4d2c-a62f-adecc51a86f0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/19644.%E2%80%85%EC%A2%80%EB%B9%84%E2%80%85%EB%96%BC%EA%B0%80%E2%80%85%EA%B8%B0%EA%B4%80%EC%B4%9D%E2%80%85%EC%A7%84%EC%A7%80%EC%97%90%EB%8F%84%E2%80%85%EC%98%A4%EB%8B%A4%EB%8B%88/dc71f165.png" data-original-src="https://upload.acmicpc.net/2edc08ef-04c2-4f16-901f-ae2bd3988512/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>유효 사거리는 진지 앞으로부터 1 m이다. 하지만 진지 바로 앞 1 m의 좀비는&nbsp;체력과 상관없이 제압할 수 있다.</p>

<p>수평 세열 지향성 지뢰는&nbsp;<em>C<sub>ammo</sub></em>개 있다.&nbsp;</p>

<p>기관총 진지라곤 하나 콘크리트로 지어진 토치카가 아니라 사대로 구축한 임시 진지이기 때문에 1 m 떨어진 길 위의 좀비를 제압하지 못한다면 사망한다.&nbsp;</p>

<p>과연 킬로와 헥토는 살아남을 수 있을까?</p>

### 입력

<p>첫 번째 줄에는 기관총 진지 앞쪽 길의 거리를 나타내는 정수&nbsp;<em>L</em>&nbsp;(1 &le;&nbsp;<em>L</em>&nbsp;&le; 3 &times; 10<sup>6</sup>)이 주어진다.&nbsp;</p>

<p>두 번째 줄에는 기관총의 유효 사거리를 나타내는 정수&nbsp;<em>M<sub>L</sub></em> (1 &le;&nbsp;<em>M<sub>L</sub></em>&nbsp;&le; 3 &times; 10<sup>6</sup>)과 각 1 m 당 살상력을 나타내는 정수&nbsp;<em>M<sub>K</sub></em> (1 &le;&nbsp;<em>M<sub>K</sub></em>&nbsp;&le; 100)가 빈칸을 사이에 두고 주어진다.</p>

<p>세 번째 줄에는 수평 세열 지향성 지뢰의 개수&nbsp;<em>C<sub>ammo</sub></em> (0&nbsp;&le;&nbsp;<em>C<sub>ammo</sub></em>&nbsp;&le; 3 &times; 10<sup>6</sup>)가 주어진다.</p>

<p>네 번째 줄부터&nbsp;<em>L</em>개의 줄에 걸쳐서 정수가 하나씩 주어진다. 이 때 <em>i</em>&nbsp;(1 &le;&nbsp;<em>i</em> &le; <em>L</em>)번째 정수는 기관총 진지에서 <em>i</em> m 떨어진 곳의 좀비의 체력&nbsp;<em>Z<sub>i</sub></em> (0 &le;&nbsp;<em>Z<sub>i</sub></em>&nbsp;&le; 3 &times; 10<sup>8</sup>)이다.&nbsp;<em>Z<sub>i</sub></em>가 0인 경우 <em>i</em> m 떨어진 곳에&nbsp;좀비가 없다는 뜻이다.</p>

### 출력

<p>킬로와 헥토가 살아남을 수 있다면 <span style="color:#e74c3c;"><code><span style="background-color:#ecf0f1;">YES</span></code></span>, 살아남을 수 없다면 <span style="color:#e74c3c;"><code><span style="background-color:#ecf0f1;">NO</span></code></span>를 출력한다.</p>