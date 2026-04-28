# [Gold II] 성향 성장의 비약 - 26652

[문제 링크](https://www.acmicpc.net/problem/26652)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 511, 정답: 101, 맞힌 사람: 86, 정답 비율: 21.182%

### 분류

수학, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>&lsquo;메이플스토리&rsquo;에는 &lsquo;성향&rsquo;이라는 시스템이 있다. &lsquo;카리스마&rsquo;, &lsquo;매력&rsquo;, &lsquo;손재주&rsquo; 등의 레벨을 올리면 각 성향마다 정해진 능력을 키울 수 있다. 지훈이는 이 게임을 오래 플레이 한 만큼 주로 키우는 캐릭터의 모든 성향은 전부 최대 레벨이다. 모든 성향의 레벨이 같으면 성향 그래프가 아래 사진처럼 정다각형이 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26652.%E2%80%85%EC%84%B1%ED%96%A5%E2%80%85%EC%84%B1%EC%9E%A5%EC%9D%98%E2%80%85%EB%B9%84%EC%95%BD/e3ddf35e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/26652.%E2%80%85%EC%84%B1%ED%96%A5%E2%80%85%EC%84%B1%EC%9E%A5%EC%9D%98%E2%80%85%EB%B9%84%EC%95%BD/e3ddf35e.png" data-original-src="https://upload.acmicpc.net/478db3d9-5151-463e-a8f0-05a7a0a58ac1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 263px; height: 284px;" /></p>

<p>성향의 레벨은 &#39;성향 아이템&#39;을 통해 올릴 수 있다. 모든 성향은 $x$레벨에서 $x+1$레벨로 올리기 위해 그 성향의 성향 아이템이 $x$개 필요하다. 혹은 <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26652.%E2%80%85%EC%84%B1%ED%96%A5%E2%80%85%EC%84%B1%EC%9E%A5%EC%9D%98%E2%80%85%EB%B9%84%EC%95%BD/11003bd0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/26652.%E2%80%85%EC%84%B1%ED%96%A5%E2%80%85%EC%84%B1%EC%9E%A5%EC%9D%98%E2%80%85%EB%B9%84%EC%95%BD/11003bd0.png" data-original-src="https://upload.acmicpc.net/555d0ab6-b369-4be8-9aff-395ab61d1d8d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 40px; height: 40px;" /> &lsquo;성향 성장의 비약&rsquo;이라는 특수한 성향 아이템은 어떤 성향이든 선택한 그 성향의 레벨을 <strong>정확히 $1$만큼</strong> 올려준다. 성향이 이미 최대 레벨이면 성향 아이템을 사용하지 못하기 때문에, 지훈이는 남는 성향 아이템들을 창고로 옮겨 다른 캐릭터의 성향의 레벨을 올려주기로 했다.</p>

<p>성향 아이템을 사용할 캐릭터는 성향의 종류가 $N$개이고, 최대 레벨이 존재하지 않아 레벨을 계속 올릴 수 있다. 또, 지훈이는 큰 정다각형을 좋아하기 때문에 캐릭터의 성향 그래프를 가장 큰 정$N$각형으로 만들고 싶다. 성향 성장의 비약의 개수, 각 성향의 현재 레벨과 각 성향의 성향 아이템의 개수가 주어질 때, 지훈이가 만들 수 있는 가장 큰 정$N$각형의 크기, 즉 정$N$각형을 만들 수 있는 레벨 중 가장 높은 레벨을 구하자!</p>

### 입력

<p>첫 번째 줄에 성향의 종류 $N$과 성향 성장의 비약의 개수 $M$이 공백으로 구분되어 주어진다. $(3 \leq N \leq 100\,000;$ $0 \leq M \leq 10^{12})$</p>

<p>두 번째 줄에 각 성향의 현재 레벨을 나타내는 $N$개의 정수 $L_1, L_2, \cdots , L_N$이 공백으로 구분되어 주어진다. $(1 \leq L_i \leq 10^9)$</p>

<p>세 번째 줄에 각 성향의 성향 아이템의 개수를 나타내는 $N$개의 정수 $A_1, A_2, \cdots , A_N$이 공백으로 구분되어 주어진다. $(0 \leq A_i \leq 10^{18})$</p>

### 출력

<p>만들 수 있는 가장 큰 정$N$각형의 크기, 즉 정$N$각형을 만들 수 있는 레벨 중 가장 높은 레벨을 출력한다.</p>

<p>만약 정다각형을 만들 수 없다면 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다.</p>

### 힌트

<p><a href="http://maplestory.nexon.com/Home/Main">메이플스토리</a>에 접속하여 이 문제 속 숨겨진 아이템을 찾아보자!</p>