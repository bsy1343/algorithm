# [Silver I] Babel - 34392

[문제 링크](https://www.acmicpc.net/problem/34392)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 13, 맞힌 사람: 13, 정답 비율: 81.250%

### 분류

격자 그래프, 그래프 이론, 그래프 탐색, 플러드 필

### 문제 설명

<p>The Tower of Babel is a biblical story in Genesis in which the entire world had one language and a common speech. Of course, the moment the entire world could easily communicate they decided to build a tower that would reach to the heavens so they would not be "scattered over the face of the earth." God, however, did not allow the people to build this tower, and He stopped this by "confusing their language" so that they no longer had one common language.</p>

<p>After this scattering, a person only knew a single language and cross-cultural communication was impossible. Thus, it became vital for the people to know if they could travel from place to place without moving through an area where an unknown language was spoken. One day, when God was feeling particularly gracious, he published a map with the locations where each language was spoken. For example:</p>

<pre>EEEE
FFFG
FGGG
FFAA
AAFA</pre>

<p>Each letter represents a common language (in the example above, <code>E</code> = English, <code>F</code> = French, <code>A</code> = Arabic, <code>G</code> = Greek). Language areas are considered connected if any of the four adjacent areas (north, south, east, or west) speak the same language.</p>

<p>Given the map and $q$ pairs of coordinates, can you determine if an individual can move between the two coordinates without passing through an area that speaks another language?</p>

### 입력

<p>The first line of input contains two integers, $1 \leq R \leq 1\,000$, denoting the number of rows in the map, and $1 \leq C \leq 1\,000$, denoting the number of columns in the map. The following $R$ lines contain exactly $C$ characters, all of which will be uppercase letters of the alphabet A-Z not including N. The next line contains an integer $0 \leq Q \leq 1\,000$, indicating the number of queries to follow. The following $Q$ lines each contain one query, given as four space separated integers $r_1, c_1, r_2, c_2$ such that $0 \leq r_1, r_2 &lt; R, 0 \leq c_1, c_2 &lt; C$. $r_1$ and $c_1$ are the row and column on the map from where the person is trying to travel, and $r_2$ and $c_2$ are the row and column on the map where the person is trying to travel to.</p>

### 출력

<p>For each query, output the character of the language that connects the two points without passing through an area that speaks another language. If it is not possible for any language to do this, output the letter "N".</p>