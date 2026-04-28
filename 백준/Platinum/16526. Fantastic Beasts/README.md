# [Platinum I] Fantastic Beasts - 16526

[문제 링크](https://www.acmicpc.net/problem/16526)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 171, 정답: 34, 맞힌 사람: 30, 정답 비율: 22.388%

### 분류

중국인의 나머지 정리, 수학, 정수론

### 문제 설명

<p>The eccentric magizoologist Newt Scamander recently came to Nlogonia to study the fantastic creatures that inhabit this prosperous kingdom. But before he could begin to explore the area an accident disrupted his plans: his suitcase sprang open and his collection of fantastic beasts escaped from the magical object.</p>

<p>The inhabitants of Nlogonia love zoos, and so there are many of them in the kingdom. It turns out that the beasts share Nlogonians&rsquo; passion for zoos and since the accident they have been visiting the various zoos.</p>

<p>Beasts breaking free and causing trouble is nothing new for Newt so he had trackers put on the beasts since the previous incident. Thus, at any moment he knows the exact position of each of the beasts. After watching the beasts movements for some time he noticed that they follow a peculiar pattern: if a beast is currently in a given zoo, after a unit of time it will either stay in that zoo or it will move to another zoo that depends on the current zoo. All beasts that move to another zoo do this instantly and simultaneously.</p>

<p>With this information Newt conjectured that perhaps it&rsquo;s not so difficult to recover the creatures. He believes that eventually all of them may meet in the same zoo at the same time so he only needs to wait at the right place and capture all the fantastic beasts at once. Given the information Newt has so far, can you help him determine where and when to wait for the beasts? If there are several possibilities, he wants to catch the beasts as early as possible.</p>

### 입력

<p>The first line contains two integers B (1 &le; B &le; 10) and Z (1 &le; Z &le; 100), indicating respectively the number of fantastic beasts and the number of zoos. Zoos are identified by distinct integers from 1 to Z. Each of the next B lines describes Newt&rsquo;s findings on a different beast with Z + 1 integers P<sub>0</sub>, P<sub>1</sub>, . . . , P<sub>Z</sub> (1 &le; P<sub>i</sub> &le; Z for i = 0, 1, . . . , Z); the value P<sub>0</sub> is the zoo where the beast initially is, while for i = 1, 2, . . . , Z the value P<sub>i</sub> is the zoo where the beast would be after a unit of time if it is currently in the zoo i.</p>

### 출력

<p>Output a single line with two integers, P and T, indicating that all the beasts will meet for the first time at zoo P after T units of time, or the character &ldquo;*&rdquo; (asterisk) if the beasts will never be all at the same zoo.</p>

<p>The input is given such that T is at most 9,223,372,036,854,775,807.</p>