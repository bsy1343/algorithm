# [Platinum IV] Denouncing Mafia - 17532

[문제 링크](https://www.acmicpc.net/problem/17532)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 43, 맞힌 사람: 38, 정답 비율: 80.851%

### 분류

그래프 이론, 그리디 알고리즘, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>Nlogonia police department is investigating the local mafia. They already know all the members and the structure of the organization: The Nlogonian mafia has N members, and each is identified by an integer between 1 and N, where 1 is the number that identifies the mafia boss. In addition, every member except the boss is a direct subordinate of another member.</p>

<p>Even after months of investigation, police still do not have enough information to arrest any mafia members for any crime. So they decided to ask for the help of a seer: given a mafia member, the seer can magically guess the crimes he has committed, and the police can then confirm them by interrogation.</p>

<p>In addition, when a Nlogonian mafia member is interrogated, he not only admits his crimes, but also, in exchange for a lighter sentence, he reports the crimes of his direct superior. If the superior has not already been arrested, the police can interrogate him as well, and he will then report his superior, and so on, until they reach the boss.</p>

<p>Unfortunately, the seer has only enough energy to guess a maximum of K mafia members, and the police wants to use the seer powers carefully so they can arrest as many bad guys as possible. Given K and the full structure of the mafia, what is the maximum amount of mafia members the police can arrest?</p>

### 입력

<p>The first line contains two integers, N and K, where N is the number of mafia members and K is the maximum number of mafia members the seer can guess (3 &le; N &le; 10<sup>5</sup>, 1 &le; K &lt; N). The second line contains N &minus; 1 integers, where the i-th of them is the number that identifies the direct superior of the mafia member with identifier i + 1. All integers in the second line of input are guaranteed to be between 1 and N, and all mafia members are subordinates of the boss, directly or indirectly.</p>

### 출력

<p>Your program must output a single line, containing an integer, representing the maximum number of mafia members the police can arrest.</p>