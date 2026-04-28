# [Platinum I] Seven Kingdoms - 9330

[문제 링크](https://www.acmicpc.net/problem/9330)

### 성능 요약

시간 제한: 9 초, 메모리 제한: 128 MB

### 통계

제출: 67, 정답: 20, 맞힌 사람: 17, 정답 비율: 37.778%

### 분류

2-sat, 그래프 이론, 강한 연결 요소

### 문제 설명

<p>Jon Dayne is the ruler of a huge country called Seven Kingdoms. He has two sisters, Arya and Sansa, and wants to give some cities of Seven Kingdoms to them. He will rule the remaining cities or if no city remains, goes to the Wall, a colossal fortiﬁcation along the northern border of the Seven Kingdoms, to be the Lord commander. Arya is the Lady of Winterfell and Sansa is the Lady of King&rsquo;s Landing. The cities in Seven Kingdoms (including Winterfell and King&rsquo;s Landing) are connected to each other with a network of roads (although some cities may be disconnected from the other cities, because they are either located on an island or they are currently at war with these other cities). There is no direct road between Winterfell and King&rsquo;s Landing and they do not share a common neighbour city.</p>

<p>Jon wants to assign a collection of cities to each one of his sisters such that each city in a collection is connected with a direct road to all other cities in that collection and the remaining cities, not in these two collections, are also connected with a direct road to each other. The collection assigned to Arya must include Winterfell and the collection assigned to Sansa must include King&rsquo;s Landing. Jon needs your help to determine whether this is possible and if this is possible, you should tell him the cities in each collection.</p>

### 입력

<p>The input consists of a single test case. The ﬁrst line contains two integers n and m, where n (2 &le; n &le; 2000) is the number of cities, m is the number of roads. Each of the next m lines contains two integers x<sub>i</sub> and y<sub>i</sub> (1 &le; x<sub>i</sub>, y<sub>i</sub> &le; n) describing one road, where x<sub>i</sub> and y<sub>i</sub> are the distinct cities the road connects. Winterfell is city 1 and King&rsquo;s Landing is city 2 in the road network.</p>

### 출력

<p>If it is not possible to partition the cities in the way explained, display the word impossible. Otherwise, display two lines: the ﬁrst containing the cities in the collection assigned to Arya and the second containing the collection of cities assigned to Sansa. If there are many such collections, any one of them is acceptable.</p>