# [Gold III] Roadblock - 9988

[문제 링크](https://www.acmicpc.net/problem/9988)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 237, 정답: 144, 맞힌 사람: 126, 정답 비율: 62.376%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Every morning, FJ wakes up and walks across the farm from his house to the barn.  The farm is a collection of N fields (1 &lt;= N &lt;= 250) connected by M bidirectional pathways (1 &lt;= M &lt;= 25,000), each with an associated length. FJ&apos;s house is in field 1, and the barn is in field N.  No pair of fields is joined by multiple redundant pathways, and it is possible to travel between any pair of fields in the farm by walking along an appropriate sequence of pathways.  When traveling from one field to another, FJ always selects a route consisting of a sequence of pathways having minimum total length.</p><p>Farmer John&apos;s cows, up to no good as always, have decided to interfere with his morning routine.  They plan to build a pile of hay bales on exactly one of the M pathways on the farm, doubling its length.  The cows wish to select a pathway to block so that they maximize the increase in FJ&apos;s distance from the house to the barn.  Please help the cows determine by how much they can lengthen FJ&apos;s route.</p>

### 입력

<ul><li>Line 1: Two space-separated integers, N and M.</li><li>Lines 2..1+M: Line j+1 describes the jth bidirectional pathway in terms of three space-separated integers: A_j B_j L_j, where A_j and B_j are indices in the range 1..N indicating the fields joined by the pathway, and L_j is the length of the pathway (in the range 1...1,000,000).</li></ul>

### 출력

<ul><li>Line 1: The maximum possible increase in the total length of FJ&apos;s shortest route made possible by doubling the length of a single pathway.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 5 fields and 7 pathways.  Currently, the shortest path from the house (field 1) to the barn (field 5) is 1-3-4-5 of total length 1+3+2=6.</p><h4>Output Details</h4><p>If the cows double the length of the pathway from field 3 to field 4 (increasing its length from 3 to 6), then FJ&apos;s shortest route is now 1-3-5, of total length 1+7=8, larger by two than the previous shortest route length.</p>