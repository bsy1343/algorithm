# [Platinum V] 네트워크 - 15562

[문제 링크](https://www.acmicpc.net/problem/15562)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 425, 정답: 199, 맞힌 사람: 145, 정답 비율: 50.877%

### 분류

그래프 이론, 방향 비순환 그래프

### 문제 설명

<p>우리의 회사에는&nbsp;<em>N</em>개의 네트워크 시스템&nbsp;<em>S</em><sub>1</sub>,&thinsp;<em>S</em><sub>2</sub>,&thinsp;...,&thinsp;<em>S</em><sub><em>N</em></sub>와 이들을 연결하는&nbsp;<em>M</em>개의 네트워크들&nbsp;<em>W</em><sub>1</sub>,&thinsp;<em>W</em><sub>2</sub>,&thinsp;...,&thinsp;<em>W</em><sub><em>M</em></sub>이 있다. 네트워크 시스템들은 우선순위가 있어 모든 네트워크는 우선순위가 높은 곳에서 낮은 곳으로만 전달된다. 즉,&nbsp;<em>S</em><sub><em>A</em></sub>에서&nbsp;<em>S</em><sub><em>B</em></sub>로 전달되는 네트워크가 있다면&nbsp;<em>A</em>&thinsp;&lt;&thinsp;<em>B</em>&nbsp;이다.</p>

<p>최근 이 네트워크 시스템이 너무 난잡해져 이를 정리하기로 했다. 이를 설명하자면, 시스템&nbsp;<em>S</em><sub><em>A</em></sub>,&nbsp;<em>S</em><sub><em>B</em></sub>,&nbsp;<em>S</em><sub><em>C</em></sub>에 대해서&nbsp;<em>S</em><sub><em>A</em></sub>에서&nbsp;<em>S</em><sub><em>B</em></sub>로 전달되는 네트워크와&nbsp;<em>S</em><sub><em>B</em></sub>에서&nbsp;<em>S</em><sub><em>C</em></sub>로 전달되는 네트워크가 있다면 이 둘을 합쳐&nbsp;<em>S</em><sub><em>A</em></sub>에서&nbsp;<em>S</em><sub><em>C</em></sub>로 전달되는 네트워크로 간략화하는 것이다. 이 방식으로 간략화를 반복해서 최대한 네트워크의 수를 줄이고자 한다. 이때, 남은 네트워크의 수를 구하여라.</p>

### 입력

<p>첫 번째 줄에&nbsp;<em>N</em>와&nbsp;<em>M</em>이 주어진다.&nbsp;(1&thinsp;&le;&thinsp;<em>N</em>,&thinsp;<em>M</em>&thinsp;&le;&thinsp;10<sup>6</sup>)</p>

<p><em>M</em>줄 동안 두 숫자&nbsp;<em>A</em><sub><em>i</em></sub>,&thinsp;<em>B</em><sub><em>i</em></sub>가 주어진다. 이는&nbsp;<em>W</em><sub><em>i</em></sub>가&nbsp;<em>S</em><sub><em>A</em><sub><em>i</em></sub></sub>와&nbsp;<em>S</em><sub><em>B</em><sub><em>i</em></sub></sub>를 연결함을 뜻한다.&nbsp;(<em>i</em>&thinsp;=&thinsp;1,&thinsp;2,&thinsp;...,&thinsp;<em>M</em>,&thinsp;1&thinsp;&le;&thinsp;<em>A</em><sub><em>i</em></sub>&thinsp;&lt;&thinsp;<em>B</em><sub><em>i</em></sub>&thinsp;&le;&thinsp;<em>N</em>)</p>

### 출력

<p>최대한 간략화했을때 남은 네트워크의 수를 출력한다.</p>