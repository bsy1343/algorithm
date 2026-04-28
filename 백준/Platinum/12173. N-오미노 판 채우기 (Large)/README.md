# [Platinum IV] N-오미노 판 채우기 (Large) - 12173

[문제 링크](https://www.acmicpc.net/problem/12173)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 131, 정답: 60, 맞힌 사람: 48, 정답 비율: 48.000%

### 분류

애드 혹, 많은 조건 분기

### 문제 설명

<p>N-오미노는 이차원 평면 위에 N개의 정사각형이 연결된 도형이다. 1-오미노는 1*1 크기의 정사각형이다. 그래서 n-노미노는 n - 1오미노에 1-오미노, 즉 1*1짜리 정사각형을 추가 한 것과 같다. 단, 두 N-오미노가 합동이면 같다고 가정한다.</p>

<p>아래에는 가능한 5가지 4-오미노가 있다.</p>

<p><img alt="images-73.png" src="%EB%B0%B1%EC%A4%80/Platinum/12173.%E2%80%85N-%EC%98%A4%EB%AF%B8%EB%85%B8%E2%80%85%ED%8C%90%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0%E2%80%85(Large)/774e9f61.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12173.%E2%80%85N-%EC%98%A4%EB%AF%B8%EB%85%B8%E2%80%85%ED%8C%90%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0%E2%80%85(Large)/774e9f61.png" data-original-src="https://upload.acmicpc.net/e9ed4bdd-14d6-477c-85f1-4b487f2c094f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>아래에는 전체 108가지의 7-오미노 중 일부가 있다.</p>

<p><img alt="images-74.png" src="%EB%B0%B1%EC%A4%80/Platinum/12173.%E2%80%85N-%EC%98%A4%EB%AF%B8%EB%85%B8%E2%80%85%ED%8C%90%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0%E2%80%85(Large)/c2a743e8.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12173.%E2%80%85N-%EC%98%A4%EB%AF%B8%EB%85%B8%E2%80%85%ED%8C%90%E2%80%85%EC%B1%84%EC%9A%B0%EA%B8%B0%E2%80%85(Large)/c2a743e8.png" data-original-src="https://upload.acmicpc.net/002f9f2d-5cde-4031-9b74-950f14df52b4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>철수와 동수는 변수 X, R, C가 정해진 상태에서 아래의 절차대로 게임을 진행하려고 한다.</p>

<p>1.철수는 가능한 X-오미노 중에서&nbsp;하나를 고른다.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>

<p>2.동수는&nbsp;여러 가지 X-오미노를 이용해서 넘치지도 부족하지도 않게 R*C 판을 채운다. 단, 철수가 고른 X-오미노를 적어도 한개를 이용해야 하며 X-오미노를 뒤집거나 회전하여 이용해도 된다. 동수가 위의 조건을 만족하면서 판을 채우면 동수는 승리하고 판을 채우지 못하면 패배한다.</p>

<p>X, R, C가 주어질때 철수가 무조건 이길지 동수가 무조건 이길지 판별하라.</p>

### 입력

<p>입력의 첫째 줄에는 테스트케이스의 수 T가 주어진다</p>

<p>다음 T개의 줄에서는 각각 X, R, C가 차례대로 주어진다.</p>

<p>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100, 1 &le;&nbsp;<strong>X, R, C</strong>&nbsp;&le; 20</p>

### 출력

<p>각각의 테스트케이스에 대하여 &quot;Case #x:y&quot;를 출력한다. 이때 x는 테스트케이스 번호(1부터 시작한다). 철수가 선택했을때 무조건 이기는 X-오미노가 하나라도 있으면 y는 RICHARD이고 하나도 없으면 y는 GABRIEL이다.</p>

### 힌트

<p>Case #1에서는 철수는 선택할 수 있는 2-오미노가 하나 밖에 없다--1*2짜리 직사각형. 2*2판은 1*2 직사각형 두개로 무조건 채울수 있으므로 동수 승!</p>

<p>Case #2에서도 철수는&nbsp;선택할 수 있는 2-오미노가 하나 밖에 없다--1*2짜리 직사각형. 하지만 동수가 그 2-오미노를&nbsp;어느것에 놓더라도 1*1이 하나 남으므로 철수 승!</p>

<p>Case #3에서 철수가 이길수 있는 방법은 2*2짜리 4-오미노를 선택하는 것이다. 1*4판에다가 2*2정사각형은 절대 넣을 수 없으므로 철수 승!</p>

<p>Case #4에서는 1*3짜리 3-오미노 또는 L모양으로 생긴 3-오미노를&nbsp;선택해야 한다. 두 경우 모두 동수가 2*3판에 하나를 놓고 똑같은 모양 하나를 더 넣으면 되므로 동수 승!</p>