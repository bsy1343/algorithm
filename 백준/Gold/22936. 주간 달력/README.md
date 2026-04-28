# [Gold IV] 주간 달력 - 22936

[문제 링크](https://www.acmicpc.net/problem/22936)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 331, 정답: 104, 맞힌 사람: 82, 정답 비율: 32.157%

### 분류

구현, 브루트포스 알고리즘, 누적 합, 차분 배열 트릭

### 문제 설명

<p>주간 달력(주력)은 일요일부터 토요일까지 총 7일간의 일정이 들어있는 달력이다.&nbsp;</p>

<p>작년 수현이는 일 년 짜리 달력에 코팅 용지를 붙여 사용했는데, 올해는 조금 더 똑똑해져서 주력에 테이프를&nbsp;이용하여 일정을 나타내려고 한다. 아뿔싸, 주력의 개수가 <em>N</em>개밖에 없는데 일정은 <em>M</em>개나 있다. 눈물을 머금고 주력을 최대한 알차게 사용하고자 한다.&nbsp;</p>

<p>주력 하나에 들어갈 수 있는 일정의 개수는 제한이 없고, <em>N</em>개의 주력은 서로 연속되어야 한다.&nbsp;주력의 맨 처음 날짜는 1이상이어야 하고, 요일은 신경 쓰지 않는다. 일정은 테이프를 이용하여 나타내는데, 하나의 일정을 나타내기 위해 불필요하게 테이프를 자르는 경우는 없다고 하자.&nbsp;예를 들면 하나의 일정을 하나의 주력에 표시할 때 여러 조각으로 나누어&nbsp;붙이지 않는다는 것이다.&nbsp;</p>

<p>테이프가 주력의 면적을 가장 많이 차지할 때&nbsp;,&nbsp;테이프를 자르는 횟수를 구해보자. 만약 테이프가 주력의 면적을 가장 많이 차지하는&nbsp;경우가 2개 이상이라면, 해당하는 경우 중에 주력의 시작 날짜가 가장 작을 때의 테이프를 자르는 횟수를 구하자.&nbsp;</p>

<p>아래의 그림을 보자.&nbsp;</p>

<p style="text-align: center;"><img alt="예시 이미지" src="%EB%B0%B1%EC%A4%80/Gold/22936.%E2%80%85%EC%A3%BC%EA%B0%84%E2%80%85%EB%8B%AC%EB%A0%A5/fc01e48a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22936.%E2%80%85%EC%A3%BC%EA%B0%84%E2%80%85%EB%8B%AC%EB%A0%A5/fc01e48a.png" data-original-src="https://upload.acmicpc.net/304a2595-7fde-4db4-aa03-3260c56b9b25/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 1052px; height: 200px;" /></p>

<p>하늘색과 회색 일정처럼 일정의 일부라도&nbsp;주력에 포함된다면 일정 개수에 포함된다. 하지만 넓이는 주력 내에 있는 영역만 계산한다.</p>

<p>초록색 일정의 경우 두 개의 주력에 포함된다. 따라서 초록색의 경우 테이프를 2번 잘라야 한다.</p>

<p>위 예시에서 테이프를 자르는 총 횟수는 10번이다. 이유는 아래의 그림과 같다.&nbsp;</p>

<p style="text-align: center;"><img alt="커팅 예시" src="%EB%B0%B1%EC%A4%80/Gold/22936.%E2%80%85%EC%A3%BC%EA%B0%84%E2%80%85%EB%8B%AC%EB%A0%A5/4f42f92a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22936.%E2%80%85%EC%A3%BC%EA%B0%84%E2%80%85%EB%8B%AC%EB%A0%A5/4f42f92a.png" data-original-src="https://upload.acmicpc.net/6f26aa3f-c4fc-440f-9d73-397eec1c195d/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 1048px; height: 200px;" /></p>

### 입력

<p>첫째 줄에는 주력의 개수 N이 주어진다. (1 &le; <em>N</em> &le; 100)</p>

<p>둘째 줄에는 일정의 개수 M이 주어진다. (1 &le; <em>M</em> &le; 1,000)</p>

<p>이후 M개의 줄에는 시작 날짜 S와 종료 날짜 E가&nbsp;주어진다. (1 &le; <em>S</em> &le; <em>E</em> &le; 50,000)</p>

### 출력

<p>테이프를 자르는 총 횟수를 출력한다.</p>

### 힌트

<p>요일은 상관없다.&nbsp;</p>