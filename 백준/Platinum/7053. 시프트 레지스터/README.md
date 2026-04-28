# [Platinum III] 시프트 레지스터 - 7053

[문제 링크](https://www.acmicpc.net/problem/7053)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 113, 정답: 31, 맞힌 사람: 22, 정답 비율: 28.571%

### 분류

수학, 선형대수학, 가우스 소거법

### 문제 설명

<p>레지스터는 계산을 하기 위해서 N비트를 저장한다. 시프트 레지스터는 레지스터의 특수한 형태로, 모든 비트를 한 자리씩 시프트 시킬 수 있다.</p>

<p>시프트 레지스터의 결과를 이용해 다음과 같이 바이너리 유사난수를 얻을 수 있다. 크기가 N인 시프트 레지스터에 a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub>이 저장되어 있다. 클럭틱마다 레지스터는 가장 오른쪽 비트 a<sub>N</sub>을 출력한다. 다른 비트는 모두 오른쪽으로 한 칸 이동하게 된다. 첫 번째 비트 a&prime;<sub>1</sub>은 다음과 같은 방법으로 구할 수 있다.</p>

<p>레지스터의 모든 비트는 아래 그림과 같이 스위치를 통해 XOR 게이트와 연결되어 있다. 각각의 비트 i마다 스위치 s<sub>i</sub>(1 또는 0)가 존재하며, 스위치는 a<sub>i</sub>를 XOR 게이트로 보낼지 말지를 결정하게 된다. k<sub>i</sub> = s<sub>i</sub>&middot;a<sub>i</sub>라고 했을 때, a&prime;<sub>1</sub>은 XOR게이트의 출력값 XOR(k<sub>1</sub>, ..., k<sub>N</sub>)이 된다. (k<sub>1</sub>, ..., k<sub>N</sub>에서 1의 개수가 홀수개이면 XOR(k<sub>1</sub>, ..., k<sub>N</sub>) = 1이고, 아니면 0이다)</p>

<ul>
	<li>a&prime;<sub>1</sub> = XOR(k<sub>1</sub>, ..., k<sub>N</sub>)</li>
	<li>a&prime;<sub>i</sub> = a<sub>i-1</sub> for 2 &le; i &le; N</li>
	<li>output = a<sub>N</sub></li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7053.%E2%80%85%EC%8B%9C%ED%94%84%ED%8A%B8%E2%80%85%EB%A0%88%EC%A7%80%EC%8A%A4%ED%84%B0/8ba202cb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7053.%E2%80%85%EC%8B%9C%ED%94%84%ED%8A%B8%E2%80%85%EB%A0%88%EC%A7%80%EC%8A%A4%ED%84%B0/8ba202cb.png" data-original-src="https://upload.acmicpc.net/efcd80dd-e936-4087-899b-56b4b47a5525/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 634px; height: 346px;" /></p>

<p>위의 예제에서 틱 1에서 a1은 다음과 같이 XOR(1&middot;1, 0&middot;0, 1&middot;1, 1&middot;1, 0&middot;0, 1&middot;0, 1&middot;1) = 0</p>

<p>시프트 레지스터의 결과 중 처음 2N개가 주어진다. 이때, 스위치 값 si를 결정하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 시프트 레지스터의 크기 N이 주어진다. (1 &le; N &le; 750) 둘째 줄에는 시프트 레지스터의 결과중 처음 2N개가 주어지며, 0 또는 1이다.</p>

### 출력

<p>입력으로 주어진 레지스터 출력 결과를 갖는 스위치 세팅이 존재하는 경우에는 si를 공백으로 구분해서 출력하고, 존재하지 않는 경우에는 -1을 출력한다.</p>

<p>가능한 스위치 세팅이 여러 가지인 경우에는 아무거나 출력한다.</p>