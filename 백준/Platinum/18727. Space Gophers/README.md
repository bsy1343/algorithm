# [Platinum II] Space Gophers - 18727

[문제 링크](https://www.acmicpc.net/problem/18727)

### 성능 요약

시간 제한: 20 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 15, 맞힌 사람: 11, 정답 비율: 37.931%

### 분류

구현, 자료 구조, 정렬, 집합과 맵, 해시를 사용한 집합과 맵, 분리 집합, 트리를 사용한 집합과 맵, 두 포인터

### 문제 설명

<p>Space Gophers live on a strange, cube-shaped asteroid, whose every side has length exactly N = 10<sup>6</sup>. Their geogophers... sorry... their geographers have divided the asteroid into N &times; N &times; N microcubes, and introduced a (standard Cartesian) coordinate system &ndash; every microcube has three coordinates (x, y, z).</p>

<p>The Gophers&rsquo; main occupation (and also favorite pastime) is tunnel digging. A lot of tunnels have been made in the asteroid &ndash; each one starts at one of the asteroid&rsquo;s outer walls and is a straight line of removed microcubes, perpendicular to that wall, all the way through to the other side. But after many years of work, today is a grand festival, and all digging is forbidden for now. Any Gopher who wants to visit their friends must move through empty space only. This makes navigation hard for poor Gophers, so they really need your help. Given a list containing some pairs of starting and ending positions, determine if the end can be reached from the start by only moving through the empty microcubes (the Gophers only move through space they have dug, never going outside the initial cube. This is probably some kind of agopheraphobia).</p>

### 입력

<p>The first line of input contains the number of test cases z (1 &le; z &le; 6). The descriptions of the test cases follow.</p>

<p>The first line of each test case contains a positive integer n (n &le; 300 000) &ndash; the number of tunnels. The next n lines describe tunnels. Each one contains a triple of integers, of the form either (x, y, &minus;1), or (x, &minus;1, z), or (&minus;1, y, z), where 1 &le; x, y, z &le; 106 are some integers. A triple (x, y, &minus;1) means that a tunnel has been dug by removing all (x, y, t) microcubes for every integer t. Similarly, a triple (x, &minus;1, z) means digging through all (x, t, z) cubes for all t, and (&minus;1, y, z) denotes a tunnel in place of all (t, y, z) cubes.</p>

<p>The next line contains the number of queries q (1 &le; q &le; 500 000), and is followed by q lines containing six integers each. Those six integers (x<sub>1</sub>, y<sub>1</sub>, z<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, z<sub>2</sub>), each of them between 1 and 10<sup>6</sup>, denote a Gopher asking for help finding a route from the cube (x<sub>1</sub>, y<sub>1</sub>, z<sub>1</sub>) to the cube (x<sub>2</sub>, y<sub>2</sub>, z<sub>2</sub>). This route must only visit empty cubes, and it must always move between adjacent cubes. We consider cubes adjacent if they share a common wall. It is guaranteed that all starting and ending positions are empty.</p>

### 출력

<p>For each test case, output answers to all queries. For each query, output &ldquo;YES&rdquo; if there is a desired route, &ldquo;NO&rdquo; if there is none.</p>