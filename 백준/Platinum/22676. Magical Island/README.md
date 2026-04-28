# [Platinum I] Magical Island - 22676

[문제 링크](https://www.acmicpc.net/problem/22676)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

기하학, 이분 탐색

### 문제 설명

<p>This is a story in the epoch of magic. A clan of magicians lived in an artificial island built by magic power.</p>

<p>One day, a crisis erupted on the island. An Empire ACM (Atlas Country of Magic) required unconditional surrender to them, otherwise an imperial force attacked by magical missiles to the island. However, they were so proud that they did not surrender to the ACM, and built a system to generate magical shield to protect the clan from the threat of magical missiles. In this system, a crystal with different elements was put on each corner of the island: the world consisted of four elements, namely Fire, Water, Air and Earth. Each crystal generated magical shield with the element of the crystal by receiving magicians&rsquo; magic power; it shielded the island from magical missiles of the same element: any magical missile consists of one of the four elements. Magic shield covered a circular area; the crystal should be located on the center the circular area. The crystal required&nbsp;<i>R</i><sup>2</sup>&nbsp;magic power to shield a circular area of radius&nbsp;<i>R</i>. However, there was one restriction. Magicians should send exactly the same amount of magic power to all crystals, otherwise the island was lost because of losing a balance between four elements.</p>

<p>They decided to live in an area which is shielded from any magical missile. Your job is to write a program to calculate minimum amount of magic power to secure enough area for them to live in.</p>

### 입력

<p>The input consists of multiple datasets. Each dataset is a single line containing three integers&nbsp;<i>W</i>,&nbsp;<i>H</i>&nbsp;and&nbsp;<i>S</i>, separated by a single space. The line containing three zeros separated by a single space indicates the end of the input.</p>

<p><i>W</i>&nbsp;and&nbsp;<i>H</i>&nbsp;are width and depth of the island, respectively.&nbsp;<i>S</i>&nbsp;is the area magicians needed to live in. You may assume that 0 &lt;&nbsp;<i>W</i>,&nbsp;<i>H</i>&nbsp;&le; 100 and 0 &lt;&nbsp;<i>S</i>&nbsp;&le;&nbsp;<i>W</i>&nbsp;&times;&nbsp;<i>H</i>.</p>

### 출력

<p>For each dataset, output a separate line containing the total minimum necessary magic power. The value may contain an error less than or equal to 0.001. You may print any number of digits after the decimal point.</p>