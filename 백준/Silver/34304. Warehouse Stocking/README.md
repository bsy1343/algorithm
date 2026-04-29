# [Silver II] Warehouse Stocking - 34304

[문제 링크](https://www.acmicpc.net/problem/34304)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 26, 정답: 23, 맞힌 사람: 20, 정답 비율: 86.957%

### 분류

자료 구조, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>CS@Mines is restocking on supplies and is looking to make an inventory management system for a warehouse which keeps those supplies.</p>

<p>Due to our warehouse constraints, we can only keep one item in any given location at a time! Therefore, we need to manage when items are taken and put into the warehouse inventory. Additionally, we only have at most $10$ copies of each item.</p>

<p>Additionally, professors and students are actively using the warehouse! While we are still unloading shipments, items may be taken out of the warehouse before more come in. There are three distinct events which can occur in the warehouse:</p>

<p>An item can be <code>PUT</code> into a specific location.</p>

<p>Someone can <code>TAKE</code> the item currently in the specified location, which removes it from the location.</p>

<p>Someone can <code>FIND</code> all of the locations that contain the specified item. Note that since there at most 10 copies of each item, this should return at most 10 locations.</p>

### 입력

<p>The first line of input will be an integer $1 \leq N \leq 10^5$ representing how many lines of input are to follow.</p>

<p>The next $N$ lines will each consist of one of the following operations:</p>

<p>A <code>PUT</code> operation, in the following format: <code>PUT [ITEM] [LOCATION]</code>.</p>

<p>A <code>TAKE</code> operation, in the following format: <code>TAKE [LOCATION]</code>. There will never be a <code>TAKE</code> operation for a location that does not currently have an item.</p>

<p>A <code>FIND</code> operation, in the following format: <code>FIND [ITEM]</code> indicating that someone wants to look up the locations of a specific item.</p>

<p>All <code>LOCATION</code>s and <code>ITEM</code>s will be strings of uppercase Latin letters (A-Z) of length at most $10$.</p>

### 출력

<p>For each <code>FIND</code> operation, output the location(s) which contain the <code>ITEM</code> specified by the <code>FIND</code> as a lexicographically sorted, space-separated list. Or, if the item cannot be found, print out: "NOT FOUND" (without the quotes).</p>

<p>The output of each <code>FIND</code> operation is based off previously seen operations; in other words, the <code>PUT</code> and <code>TAKE</code> operations are done in chronological order.</p>