# [Gold IV] 이진수씨의 하루 일과 - 17830

[문제 링크](https://www.acmicpc.net/problem/17830)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 544, 정답: 206, 맞힌 사람: 153, 정답 비율: 42.149%

### 분류

수학, 그리디 알고리즘, 차분 배열 트릭

### 문제 설명

<p>이진수 씨는 이진수를 사랑한다. 그의 하루 일과는 하루 종일 이진수 두 개를 생각해놓고, 그 두 수의 곱을 &quot;오늘의 이진수&quot;로 선정한다. 그리고 예쁜 종이를 한 장 사와 &quot;오늘의 이진수&quot;를 적은 후 액자에 전시한다. 그러나 그런 진수씨에게도 시련이 찾아왔으니, 종이를 사기 위해 나온 도중에 &quot;오늘의 이진수&quot;를 잊어버리고 만 것이다. 하지만, 진수 씨가 오늘 하루 생각해 놓은 두 이진수에 대해서는 어렴풋이 기억하고 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17830.%E2%80%85%EC%9D%B4%EC%A7%84%EC%88%98%EC%94%A8%EC%9D%98%E2%80%85%ED%95%98%EB%A3%A8%E2%80%85%EC%9D%BC%EA%B3%BC/21b469ff.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17830.%E2%80%85%EC%9D%B4%EC%A7%84%EC%88%98%EC%94%A8%EC%9D%98%E2%80%85%ED%95%98%EB%A3%A8%E2%80%85%EC%9D%BC%EA%B3%BC/21b469ff.png" data-original-src="https://upload.acmicpc.net/5da7fe6a-e723-4223-9a21-2215d16a9469/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 459px; width: 600px;" /> &nbsp;</p>

<p>그 두 이진수를 A와 B라고 하자. 진수 씨가 기억하는 사실은 다음과 같다. A와 B는 <em>N</em>개의 비트로 이루어져 있다. A의 모든 비트는 1이다. 하지만 B의 일부 비트는 기억하지 못한다. 여기서 &quot;오늘의 이진수&quot;를 어느 정도 추측해 볼 수 있다.</p>

<p>예를 들어, <em>N</em> = 4라면 A = 1111이다. 여기서 B = ?00?라고 해보자. ?는 기억하지 못하는 비트를 의미한다. 그렇다면 B는 0000, 0001, 1000, 1001중 하나일 것이다. 따라서 이 경우 &quot;오늘의 이진수&quot;는 A&times;B, 즉 0, 1111, 1111000, 10000111중 하나일 것이다. B는 leading zero를 포함할 수 있지만, &quot;오늘의 이진수&quot;는 leading zero를 생략한다. 즉, B는 맨 앞 자리가 1이 아닐 수 있지만, 진수씨가 &quot;오늘의 이진수&quot;를 적을 때에는 A&times;B=0일 때를 제외하면 맨 앞자리가 반드시 1이 되도록 0을 생략한다.</p>

<p>진수 씨는 &quot;오늘의 이진수&quot;에 비해 너무 크거나 작은 종이를 사고 싶지 않다. 따라서 &quot;오늘의 이진수&quot;를 쓸 때, 가능한 최대 자릿수와 최소 자릿수를 구해보고자 한다. 하지만, 진수 씨는 그의 일생 동안의 경험으로 큰 이진수를 빠르게 곱하는 것은 매우 어렵다는 것을 알고 있다. 따라서 여러분이 그 답을 대신 구해주자.</p>

### 입력

<p>첫 번째 줄에 테스트케이스의 개수 <em>T</em>(1 &le; <em>T</em> &le; 20)가 주어진다.&nbsp;</p>

<p>두 번째 줄부터 <em>T</em>개의 줄에 걸쳐, A와 B의 길이 <em>N</em>(1 &le; <em>N</em> &le; 1,000,000)과 <em>B</em>가 공백으로 구분되어 주어진다. <em>B</em>는 0, 1, ?로 이루어져 있으며, ?는 해당 비트를 기억하지 못함을 의미한다.</p>

### 출력

<p style="text-align:justify; margin-bottom:11px"><em>T</em>개의 줄에 걸쳐, 각 테스트케이스에 대해 &quot;오늘의 이진수&quot;의 최대 자릿수와 최소 자릿수를 공백으로 구분하여 출력한다.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17830.%E2%80%85%EC%9D%B4%EC%A7%84%EC%88%98%EC%94%A8%EC%9D%98%E2%80%85%ED%95%98%EB%A3%A8%E2%80%85%EC%9D%BC%EA%B3%BC/fba31695.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17830.%E2%80%85%EC%9D%B4%EC%A7%84%EC%88%98%EC%94%A8%EC%9D%98%E2%80%85%ED%95%98%EB%A3%A8%E2%80%85%EC%9D%BC%EA%B3%BC/fba31695.png" data-original-src="https://upload.acmicpc.net/da815b55-fffe-42b2-874d-af385dcfef5e/-/crop/409x478/377,165/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 292px; width: 250px;" /> &nbsp;</p>

<p>이진수의 곱셈 역시 십진수를 곱하는 것과 유사한 방식으로&nbsp;계산할 수 있다.</p>