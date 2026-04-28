# [Platinum III] 여우가 정보섬에 올라온 이유 - 17131

[문제 링크](https://www.acmicpc.net/problem/17131)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 2684, 정답: 1138, 맞힌 사람: 874, 정답 비율: 41.599%

### 분류

자료 구조, 세그먼트 트리, 스위핑

### 문제 설명

<p>여우가 정보섬에 올라왔다!</p>

<p>오늘도&nbsp;하늘에는&nbsp;아름다운 별들이 빛나고 있다. 정보섬은 언덕 꼭대기에 위치해 있기 때문에 별이 잘 보이기로 유명하다. 그래서인지,&nbsp;여우 한 마리가&nbsp;정보섬에 올라와 밤하늘을 바라보며 별자리를 만들고 있다.&nbsp;여우는 세 개의 별을 연결하여 V형 별자리를&nbsp;만드는데, 그 이유는&nbsp;V가 자신의 얼굴과 닮았기 때문이라나 뭐라나.&nbsp;여우는 자신의 시점을 기준으로 생각하기 때문에,&nbsp;V가 회전한 모양(&lt;, &gt;, ㄴ, ㄱ, ^ 등)은&nbsp;V라고 생각하지 않는다.</p>

<p>여우는 만들 수 있는 V형 별자리의 총 개수가 궁금해졌다. 그러나 일일이 세보기에는&nbsp;별이 너무 많았기 때문에, 여우는&nbsp;뛰어난&nbsp;프로그래머인 당신에게 도움을 요청했다! 귀여운 여우를&nbsp;위해&nbsp;얼마나 많은 V형 별자리가&nbsp;만들어질 수 있는지 계산해 주자.</p>

<p>V형 별자리를&nbsp;명확하게&nbsp;정의하면&nbsp;다음과 같다.&nbsp;세 별 (s,t,u)가 <b>s.x &lt; t.x &lt; u.x</b>이고 <b>s.y &gt; t.y &lt; u.y</b>이면 V형 별자리이다. 예를 들어 아래의&nbsp;&#39;정보섬의 밤하늘&nbsp;참고도&#39;에서 (a,b,c)는 V형 별자리를 이루지만&nbsp;(d,b,c)는 d.x &lt; b.x가 아니므로 V형 별자리가 아니다. V형 별자리의 개수를 셀&nbsp;때,&nbsp;한 별이 여러 별자리에 속할 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17131.%E2%80%85%EC%97%AC%EC%9A%B0%EA%B0%80%E2%80%85%EC%A0%95%EB%B3%B4%EC%84%AC%EC%97%90%E2%80%85%EC%98%AC%EB%9D%BC%EC%98%A8%E2%80%85%EC%9D%B4%EC%9C%A0/9131c7c7.png" data-original-src="https://upload.acmicpc.net/dbf080bd-9e82-4a6b-af2e-4e3043244970/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>답이 매우 커질 수 있으므로&nbsp;(10<sup>9</sup>+7)로 나눈 나머지를 출력한다.</p>

### 입력

<p>첫 줄에 별의 개수 N이 주어진다. 그 다음 줄부터 N개의 줄에 걸쳐 별의 좌표 x&nbsp;y가 주어진다.</p>

### 출력

<p>(만들 수 있는 V형 별자리의 개수) mod (10<sup>9</sup>+7)을&nbsp;출력한다.</p>

### 제한

<ul>
	<li>1 &le; N &le; 2&times;10<sup>5</sup></li>
	<li>-2&times;10<sup>5</sup>&nbsp;&le; x,y &le; 2&times;10<sup>5</sup>&nbsp;(x,y는&nbsp;정수)</li>
</ul>