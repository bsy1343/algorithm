# [Gold III] 미팅의 저주 - 17268

[문제 링크](https://www.acmicpc.net/problem/17268)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 1356, 정답: 675, 맞힌 사람: 601, 정답 비율: 52.489%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>인하대 컴퓨터 공학과에 재학 중인 이산이는 오랜만에 미팅을 나가 볼까 한다. 미팅은 <em>N</em>명이 원탁에 앉아서 진행된다고 한다. 질투가 난 이산이 친구 명기는 X의 저주를 걸었다. 그 저주는 <em>N</em>명이 동시에 2명씩 짝을 지어 악수할 때 사람의 팔이 교차되거나 한 사람이라도 악수를 하지 못하면 그 미팅은 실패하게 되는 저주다. 하지만 명기는 이산이에게 저주를 풀 기회를 주었다. 미팅에 성공할 경우의 수를 구하여 큰소리로 외치면 저주가 풀린다. 하지만 이산이는 계산 능력이 부족해서 당신에게 도움을 청했다. 이산이가 걸린 저주를 풀어주는 프로그램을 만들어주자.</p>

<p>미팅에 참가한 사람이 4명일 경우 미팅에 성공할 경우는 다음 그림과 같이 2가지이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17268.%E2%80%85%EB%AF%B8%ED%8C%85%EC%9D%98%E2%80%85%EC%A0%80%EC%A3%BC/9cbff27d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17268.%E2%80%85%EB%AF%B8%ED%8C%85%EC%9D%98%E2%80%85%EC%A0%80%EC%A3%BC/9cbff27d.png" data-original-src="https://upload.acmicpc.net/64896646-17dc-45ec-a2e9-6e26611f9825/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 190px; width: 700px;" /></p>

<p>미팅에 참가한 사람이 6명일 경우 미팅에 성공할 경우는 다음 그림과 같이 5가지이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17268.%E2%80%85%EB%AF%B8%ED%8C%85%EC%9D%98%E2%80%85%EC%A0%80%EC%A3%BC/df671a51.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17268.%E2%80%85%EB%AF%B8%ED%8C%85%EC%9D%98%E2%80%85%EC%A0%80%EC%A3%BC/df671a51.png" data-original-src="https://upload.acmicpc.net/8ae1f9a1-df3b-4a2f-b2e3-502b1651e805/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 700px; height: 149px;" /></p>

### 입력

<p>첫째 줄에 미팅에 참가하는 사람의 수 <em>N&nbsp;</em>이 주어진다. 이 값은 10,000이하의&nbsp;짝수이다.</p>

### 출력

<p>미팅에 성공하는 경우의 수를 987654321로 나눈 나머지를 출력한다.</p>