# [Gold II] 색깔 통일하기 - 17307

[문제 링크](https://www.acmicpc.net/problem/17307)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 470, 정답: 261, 맞힌 사람: 214, 정답 비율: 56.464%

### 분류

누적 합

### 문제 설명

<p><em>N</em>개의 버튼이 일렬로 나열되어 있다. 이 버튼들은 바로 양옆에 인접한 버튼끼리 연결되어 있다. 각&nbsp;버튼은 LED가 내장되어있어 총 <em>C&nbsp;</em>종류의 색을 띨&nbsp;수 있다. 그&nbsp;색깔들을 각각 0번 색깔, 1번 색깔, ..., (<em>C</em>-1)번 색깔이라고 하자.</p>

<p>이때 현재 색깔이 <em>x</em>인 한 버튼을 누르면&nbsp;누른 버튼과 함께 해당 버튼의 양옆으로 같은 색으로 연속해서 이어진 모든 버튼이 (<em>x</em>+1)%<em>C</em>&nbsp;번 색깔로 변한다. 우리의 목표는 버튼을 누르는 횟수를 최소화하며 모든 버튼을 같은 색깔로 만드는 것이다.</p>

<p>예를 들어, <em>N</em>=5, <em>C</em>=4일 때 아래와&nbsp;같은 색의 버튼들이 있다고 하자.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17307.%E2%80%85%EC%83%89%EA%B9%94%E2%80%85%ED%86%B5%EC%9D%BC%ED%95%98%EA%B8%B0/1fa4bb1a.png" data-original-src="https://upload.acmicpc.net/6a34baca-47f5-4d6b-b5e9-a5dc5e573f78/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 109px; width: 600px;" /></p>

<p>여기서 4번&nbsp;버튼을 누르면&nbsp;현재 4번 버튼의 양옆에 같은 색의 버튼이 없으므로 4번 버튼의 색만&nbsp;0번 색깔로 바뀌게 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17307.%E2%80%85%EC%83%89%EA%B9%94%E2%80%85%ED%86%B5%EC%9D%BC%ED%95%98%EA%B8%B0/c383cf61.png" data-original-src="https://upload.acmicpc.net/3ff216fc-c676-4999-b350-d58c6d13a2a8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 109px;" /></p>

<p>그 이후&nbsp;2번째 버튼을 누르면 2번의 왼쪽으로는 같은 색의 버튼이 없고, 오른쪽으로 연속한 3, 4번 버튼이 2번 버튼의 색과 같으므로 2, 3, 4번 버튼의 색이 1번 색깔로 바뀐다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17307.%E2%80%85%EC%83%89%EA%B9%94%E2%80%85%ED%86%B5%EC%9D%BC%ED%95%98%EA%B8%B0/bf6c2d7b.png" data-original-src="https://upload.acmicpc.net/3606753a-6a72-49ad-b1ca-aab5c078f9ab/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 109px; width: 600px;" /></p>

<p>그 이후&nbsp;3번째 버튼을 누르면 1, 2, 3, 4, 5번 버튼의 색이 모두 함께 2번 색깔로 바뀌게 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17307.%E2%80%85%EC%83%89%EA%B9%94%E2%80%85%ED%86%B5%EC%9D%BC%ED%95%98%EA%B8%B0/5a95c63e.png" data-original-src="https://upload.acmicpc.net/697d01d9-a812-4842-b3eb-c0393e7e8e11/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 109px; width: 600px;" /></p>

<p>우리의 목적은 버튼을 누르는 횟수를 최소화 하면서 모든 버튼의 색을 한 색으로 통일시키는 것이다.&nbsp;위의 방법대로면 4번 버튼을 누른&nbsp;후 2번 버튼을 누르면서 2회만에 1번 색으로 통일된다.</p>

<p>하지만 지금은 어떤 이유로&nbsp;오직 하나의 버튼만 누를 수 있기에, 4번 버튼을 누르고 2번 버튼을 누르는 방법은 쓸 수 없게 되었다. 그렇다면 어떤 버튼을 선택해야 해당 버튼을 최소한으로 누르며&nbsp;모든 버튼의 색을&nbsp;통일시킬 수 있을까?</p>

### 입력

<p>첫 번째 줄에 버튼의 수 <em>N</em>(1&nbsp;&le;&nbsp;<em>N</em> &le;&nbsp;250,000)과 가능한 색의 수 (1&nbsp;&le;&nbsp;<em>C</em>&nbsp;&le;&nbsp;10<sup>9</sup>)가 공백으로 구분되어 주어진다.</p>

<p>다음 줄에 현재 각 버튼의 색 <em>X<sub>i</sub></em> (0 &le;<em>&nbsp;X<sub>i</sub></em>&nbsp;&lt; <em>C</em>, 1 &le; <em>i</em> &le; <em>N</em>)가 공백으로 구분되어 주어진다.</p>

### 출력

<p>첫 번째 줄에 몇 번 버튼을 눌러야 하는지 출력한다, 버튼에는&nbsp;가장 왼쪽에서 시작해 1번부터 <em>N</em>번까지 번호가 차례로 매겨져 있다.</p>

<p>두 번째 줄에 모든 버튼을 같은 색으로 통일시키기 위해 그 버튼을 눌러야 할 횟수를 출력한다. <strong>만약 최소 횟수가 되는 버튼이 여러 개 존재한다면 그중 가장 왼쪽의 버튼을 출력한다.</strong></p>