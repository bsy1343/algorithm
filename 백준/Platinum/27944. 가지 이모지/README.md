# [Platinum V] 가지 이모지 - 27944

[문제 링크](https://www.acmicpc.net/problem/27944)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 527, 정답: 161, 맞힌 사람: 90, 정답 비율: 27.190%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 수학, 정수론, 집합과 맵

### 문제 설명

<p>가지컵 출제를 위한 디스코드 채팅방에서는 메시지에 가지 이모지로 반응을 달 수 있다. kiwiyou가 보낸 메시지에 가지 이모지가 $N$종류 달려 있고, $i$번째 가지 이모지에 반응이 $A_i$개 달려 있다고 하자. ($1\le i\le N$)</p>

<p>민규는 각 이모지에 반응을 최대 한 번만 할 수 있다. 민규가 $i$번째 이모지에 반응을 한다면 $i$번째 이모지의 반응 개수가 $A_i$에서 $A_i + 1$로 변한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27944.%E2%80%85%EA%B0%80%EC%A7%80%E2%80%85%EC%9D%B4%EB%AA%A8%EC%A7%80/38a7006c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27944.%E2%80%85%EA%B0%80%EC%A7%80%E2%80%85%EC%9D%B4%EB%AA%A8%EC%A7%80/38a7006c.png" data-original-src="https://upload.acmicpc.net/d3ab8f3b-d959-4a7b-8841-3d311c99b53a/-" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: min(100%,431px); height: auto;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27944.%E2%80%85%EA%B0%80%EC%A7%80%E2%80%85%EC%9D%B4%EB%AA%A8%EC%A7%80/a812a4c9.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27944.%E2%80%85%EA%B0%80%EC%A7%80%E2%80%85%EC%9D%B4%EB%AA%A8%EC%A7%80/a812a4c9.png" data-original-src="https://upload.acmicpc.net/df8d80c5-6d00-4006-9331-2adca3889b66/-" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: min(100%,431px); height: auto;" /></p>

<p style="text-align: center;"><small>메시지 아래에 각 이모지와 반응 개수가 적혀 있다. $A=[2,6,8,9,5]$에서 반응 후 $B=[3,6,9,9,6]$이 되었다.</small></p>

<p>민규가 $0$개 이상의 이모지에 반응을 한 후 $i$번째 이모지의 반응 개수를 $B_i$라고 하자. 메시지의 반응 개수에 대한 민규의 만족도는 $\gcd(B_1,$ $B_2,$ $\cdots,$ $B_n)$으로 정의된다.</p>

<p>민규가 적절히 반응을 해서 얻을 수 있는 최대의 만족도를 구하자.</p>

### 입력

<p>첫째 줄에 이모지의 종류 수 $N$이 주어진다. $(1\le N\le 5 \times 10^5)$</p>

<p>둘째 줄에 각 이모지의 개수 $A_i$가 주어진다. $(1\le A_{i}\le 10^{12})$</p>

### 출력

<p>첫째 줄에 민규가 적절히 반응을 해서 얻을 수 있는 최대 만족감을 출력한다.</p>