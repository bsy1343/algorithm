# [Platinum II] Find the Parts - 25673

[문제 링크](https://www.acmicpc.net/problem/25673)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 65, 정답: 21, 맞힌 사람: 6, 정답 비율: 23.077%

### 분류

해싱, 수학, 확률론

### 문제 설명

<p>Two robots, Carl and Clara, are a part of a secret network designed to pass messages.</p>

<p>Robot Clara has got a secret message. The message has a form of a black-and-white rectangle of $r$ rows and $c$ columns which contains $r \times c$ pixels. Each pixel is characterized by brightness: an integer from $0$ to $255$ (a byte) where $0$ is black, $255$ is white, and the numbers in between correspond to different shades of gray.</p>

<p>Clara does not know whether the message has some hidden meaning, but it definitely looks like &quot;white noise&quot;: each pixel can be considered to have a random value which is independent from other pixels and uniformly distributed among the $256$ possible colors.</p>

<p>Clara&#39;s job is to answer questions by robot Carl. Each question is formulated as a small black-and-white rectangle. The answer is the coordinates of that rectangle in the original message.</p>

<p>However, before answering questions, Clara has to delete the message. Unfortunately, her memory is limited to a mere $400$ kibibytes, so the message may not fit there...</p>

<p>How should Clara act to nevertheless answer all the questions correctly?</p>

### 입력



### 출력

