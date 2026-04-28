# [Platinum IV] Introspective Caching - 5050

[문제 링크](https://www.acmicpc.net/problem/5050)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 18, 맞힌 사람: 13, 정답 비율: 52.000%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>In a distributed system, data is never where you need it, and fetching data over a network takes time and consumes bandwidth. The problem can be mitigated by adding a cache, where a node stores some resources locally and if those resources need to be used again, it can simply take them from its cache rather than asking someone else for them.</p>

<p>However, caches have a nasty tendency to fill up, so at some point, objects must be evicted from the cache to make room for new objects. Choosing what object to remove from the cache is not easy and there are several different algorithms to choose from.</p>

<p>The marvelous Apes in Computing Machinery have come up with a fantastic new algorithm, the Introspective Caching Algorithm, named after a city of Peru. It consists of some extra hardware (a very small, precognitive monkey) which helps making decisions. Since the monkey can see into the future, she knows exactly what objects will be accessed and in what order, and using this information she will make optimal decisions on what objects to remove from the cache. Optimality here means that she will minimize the number of times an object is read into the cache.</p>

<p>All object accesses go through the cache, so every time an object is accessed, it must be inserted into the cache if it was not already there. All objects are of equal size, and no writes occur in the system, so a cached object is always valid. When the system starts, the cache is empty.</p>

<p>You have been tasked with evaluating the monkey&rsquo;s performance, and feeding her the occasional banana.</p>

### 입력

<p>The first line of input contains three integers, separated by single spaces, telling you how many objects fit in the cache, 0 &lt; c &le; 10000, how many different objects are in the system, c &le; n &le; 100000, and how many accesses, 0 &le; a &le; 100000, will occur. The following a lines contain a single integer between 0 and n &minus; 1 (inclusive) indicating what object is accessed. The first line corresponds to the first object accessed access and the last line to the last.</p>

### 출력

<p>Output the least number of times an object must be read into the cache to handle the accesses listed in the input.</p>