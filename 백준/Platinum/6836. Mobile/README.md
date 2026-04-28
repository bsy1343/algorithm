# [Platinum IV] Mobile - 6836

[문제 링크](https://www.acmicpc.net/problem/6836)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

그래프 이론, 트리, 해싱, 트리 동형 사상

### 문제 설명

<p>Fred is a baby. Above Fred&rsquo;s crib hangs a mobile. Fred is amused by this mobile. Fred has a twin sister, Mary. Above Mary&rsquo;s crib hangs another mobile. Fred wonders whether the mobile above his crib and the mobile above Mary&rsquo;s crib are the same. Help Fred.</p>

<p>A mobile is a collection of bars, strings, and decorative weights suspended from the ceiling. Each bar is suspended by a string tied to the exact centre of the bar. From each end of a bar hangs a string that is tied either to another bar or to a weight. The bars can rotate freely about their centres. Fred cannot tell two bars apart, even if they have different lengths. Fred also cannot tell two strings apart. Fred therefore considers two mobiles to be the same if the bars of one mobile can be rotated somehow to make the two mobiles appear identical.</p>

<p>Fred has even developed a notation for describing mobiles. He assigns each bar a distinct positive integer from 1 to the number of bars in the mobile, and he assigns the various objects negative integers. 1 always represents the bar suspended from the ceiling. (So, for example, a biplane might be represented by Fred as object &minus;2, a crescent-moon might be object &minus;57, and a star might be object &minus;21.) Fred can only count down to &minus;9999, so you can assume that he gave no objects lower numbers than &minus;9999.</p>

### 입력

<p>The input contains two mobile descriptions. The first line of a mobile description contains a single nonnegative integer n (1 &le; n &le; 100000), indicating the number of bars in the mobile. On the next n lines, there are two numbers per line, with these two numbers representing the objects hanging from bar i.</p>

### 출력

<p>Output is composed of one line. Write &ldquo;<code>Fred and Mary have different mobiles.</code>&rdquo; if Fred&rsquo;s information is enough to distinguish the two mobiles; otherwise, &ldquo;<code>Fred and Mary might have the same mobile.</code>&rdquo;.</p>