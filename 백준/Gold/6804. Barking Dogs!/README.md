# [Gold II] Barking Dogs! - 6804

[문제 링크](https://www.acmicpc.net/problem/6804)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 11, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>You live in a neighbourhood of dogs. Dogs like dogs. Dogs like barking even better. But best of all, dogs like barking when other dogs bark.</p>

<p>Each dog has a collection of dogs that can hear him/her. Each dog has a delay time in barking if they hear another dog bark.</p>

<p>Dog 1 always starts barking first, and this first bark occurs during second number 0.</p>

<p>Your job is to figure out how many times each dog has barked in the first T seconds (inclusive). You can assume that sound travels instantly from the mouth of one dog into the ear of another.</p>

<p>Each dog spends any given second doing one of three things: sleeping, waiting, or barking. If dog i hears a bark during a second n when it is sleeping, the dog wakes up and waits during seconds n+1 through n+w<sub>i</sub>&minus;1 inclusive, barks during second n+w<sub>i</sub>, then goes back to sleep from second n+w<sub>i</sub>+ 1 onward. If a dog hears a bark during a second in which it is waiting or barking, it ignores the bark.</p>

<p>During second number 0, all the dogs except Dog 1 are sleeping.</p>

### 입력

<p>The first line of input is D (1 &le; D &le; 1000), the number of dogs in the neighbourhood.</p>

<p>The next D lines of each contain an integer w<sub>i</sub> (1 &le; w<sub>i</sub> &le; 1000) representing the time (in seconds) that dog i waits before considering to bark upon hearing a bark.</p>

<p>The next line contains the number F (1 &le; F &le; 10, 000). On each of the next F lines, there are two integers: i and j, representing that when dog i barks, dog j hears this bark. It is never the case that i = j.</p>

<p>The next line (which is the last line of input) contains the integer T (1 &le; T &le; 1000), the number of seconds during which your program is to monitor the dogs.</p>

### 출력

<p>Produce one line of output for each dog in order from dog 1 to dog D. On line i, output the number of seconds between 1 and T inclusive that dog i spent barking.</p>