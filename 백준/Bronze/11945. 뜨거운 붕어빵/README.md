# [Bronze IV] 뜨거운 붕어빵 - 11945

[문제 링크](https://www.acmicpc.net/problem/11945)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 16208, 정답: 9640, 맞힌 사람: 8683, 정답 비율: 62.239%

### 분류

구현, 문자열

### 문제 설명

<p>고려대학교에 입학한 새내기 호돌이는 안암역을 지나다가 한 붕어빵 장수를 만났어요.</p>

<p>&ldquo;안녕, 안녕, 안녕하십니까, 아저씨! 붕어빵 두 개 주세요.&rdquo;</p>

<p>&ldquo;안녕을 세 번 외쳤으니 붕어빵 세 개!&rdquo;</p>

<p>붕어빵 두 개의 값을 내고 세 개를 받은 호돌이는 기분이 좋았어요. 호돌이가 붕어빵 하나를 꺼내어 한 입 물었는데&hellip;. 너무 뜨거워서 그만 붕어빵을 떨어뜨리고 말았어요ㅠㅠ</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/11945.%E2%80%85%EB%9C%A8%EA%B1%B0%EC%9A%B4%E2%80%85%EB%B6%95%EC%96%B4%EB%B9%B5/7794093f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11945/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:166px; width:356px" /></p>

<p>붕어빵은 자유 낙하운동을 하면서 땅에 떨어졌는데 신기하게도 좌우가 뒤집힌 모양으로 착지했답니다. 호돌이가 붕어빵을 한 입 물기 전의 모양이 입력으로 주어지면, 땅에 떨어졌을 때에는 어떤 모양일지 출력하세요.</p>

### 입력

<p>첫째 줄에는 두 개의 정수 N과 M(0&le;N,M&le;10)이 주어집니다. 둘째 줄부터 N개의 줄에 걸쳐 붕어빵의 모양이 주어집니다. 각 행에는 공백을 나타내는 &lsquo;0&lsquo; 또는 붕어빵을 나타내는 &lsquo;1&rsquo;이 총 M개 주어집니다.&nbsp;</p>

### 출력

<p>입력으로 주어진 붕어빵이 좌우로 뒤집힌 모양을 출력하세요.</p>

### 힌트

<p>입력으로 주어지는 각 행을 반전시켜서 출력하면 됩니다. 입력의 1행 1열은 출력의 1행 M열로, 입력의 1행 2열은 출력의 1행 M-1열로 &hellip; 입력의 1행 M열은 출력의 1행 1열로 &hellip; 입력의 N행 M열은 출력의 N행 1열로 출력하세요.</p>