# [Platinum II] 뚜루루 뚜루 - 16129

[문제 링크](https://www.acmicpc.net/problem/16129)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 316, 정답: 109, 맞힌 사람: 91, 정답 비율: 44.175%

### 분류

백트래킹, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 구현, 수학

### 문제 설명

<p>최근 <strong>아기 석환</strong>이라는 노래가 큰 인기를 끌고 있다. 이 노래는 귀여운 아기 석환 캐릭터가 등장하는 동영상과 중독성 있는 <strong>뚜루루 뚜루</strong> 후렴구로 전국 각지의 학생들과 직장인들의 마음을 사로잡았다.</p>

<p>강남의 직장인 gs12117 역시 이 노래에 흠뻑 빠졌다. 특히 이 노래의 후렴구에 중독된 gs12117은 <em>R</em>줄 <em>C</em>칸으로 나뉘어진 종이에 <strong>뚜루루 뚜루</strong> 후렴구를 계속해서 적어 나가기 시작했다. 후렴구를 적을 때는 종이의 첫 줄 가장 왼쪽 칸에서부터 오른쪽으로 한 칸에 한 글자씩 <strong>뚜</strong>, <strong>루</strong>, <strong>루</strong>, <strong>뚜</strong>, <strong>루</strong>를 순서대로 적어 나가며, 한 줄의 가장 오른쪽 칸에 도달하면 다음 줄의 가장 왼쪽 칸으로 넘어간다.</p>

<p style="text-align:center;"><img alt="7×7 종이에서의 예시" src="%EB%B0%B1%EC%A4%80/Platinum/16129.%E2%80%85%EB%9A%9C%EB%A3%A8%EB%A3%A8%E2%80%85%EB%9A%9C%EB%A3%A8/bf0e71e2.png" data-original-src="https://upload.acmicpc.net/029ee55c-5dba-4f51-b5e4-690d13d4162e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><br clear="right" />
7&times;7 종이에서의 예시 &nbsp;</p>

<p>gs12117은 이 종이에서 <strong>뚜루루 뚜루</strong> 경로를 많이 찾으려고 한다. <strong>뚜루루 뚜루</strong> 경로란 임의의 칸에서 출발해서 이미 방문한 칸을 다시 방문하지 않도록 상하좌우로 이동하면서 각 칸에 적힌 글자를 순서대로 읽었을 때, 그 결과가 정확히 <strong>뚜루루 뚜루</strong>가 되는 경로를 말한다.</p>

<p>종이의 크기가 주어졌을 때, gs12117이 찾을 수 있는 <strong>뚜루루 뚜루</strong> 경로의 개수를 구하여라. 어떤 두 경로가 같은 순서에 다른 칸을 방문할 경우 두 경로는 서로 다른 경로이다.</p>

### 입력

<p>첫 줄에 종이의 줄 수와 칸 수를 의미하는 정수 <em>R</em>과 <em>C</em>(1 &le; <em>R</em>, <em>C</em> &le; 12,117)가 주어진다.</p>

### 출력

<p>첫 줄에 gs12117이 찾을 수 있는 <strong>뚜루루 뚜루</strong>&nbsp;경로의 개수를 출력한다.</p>

### 힌트

<p>첫 번째 예시에서는 다음과 같은 경로들이 가능하다.</p>

<p style="text-align:center;"><img alt="3×4 종이에서의 예시" src="%EB%B0%B1%EC%A4%80/Platinum/16129.%E2%80%85%EB%9A%9C%EB%A3%A8%EB%A3%A8%E2%80%85%EB%9A%9C%EB%A3%A8/545049b1.png" data-original-src="https://upload.acmicpc.net/489e66b2-1e2e-47dc-ab58-fe675f610efc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>