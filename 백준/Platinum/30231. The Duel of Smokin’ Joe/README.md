# [Platinum II] The Duel of Smokin’ Joe - 30231

[문제 링크](https://www.acmicpc.net/problem/30231)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 5, 맞힌 사람: 5, 정답 비율: 41.667%

### 분류

(분류 없음)

### 문제 설명

<p>In the wild west, they take their Computer Science very seriously. Smokin&rsquo; Joe is widely known for his skills, and outlaws come from across the land to challenge him in a good ol&rsquo; fashioned sortin&rsquo; duel. The way that outlaws duel in the wild west, of course, is trying to be the one who makes the last move to sort an array of integers.</p>

<p>One fateful day, Smokin&rsquo; Joe&rsquo;s nemesis, an infamous character known as The Outlaw, came to town and challenged Joe to a duel. The rules of the duel are as follows: the outlaw will spin the chambers, and a random permutation of length n will fall out (a permutation of length n is an array of the integers from 1 to n in any order). Smokin&rsquo; Joe and The Outlaw will take turns swapping two elements in this permutation, until the permutation is sorted in increasing order. The winner is the player who makes the last swap. Once an element is in its final position (i.e., value k is at position k), that element cannot be moved for the rest of the game; otherwise, there are no restrictions on which two elements can be swapped.</p>

<p>Both Smokin&rsquo; Joe and The Outlaw will always play perfectly, i.e., they play to win and not necessarily to sort the list as quickly as possible. Can you predict who will win?</p>

<p>Given a permutation, predict the winner of the game, where players take turns swapping elements, and an element cannot move once it&rsquo;s in its final sorted position. The winner is the person who makes the final move to sort the array. Note that Smokin&rsquo; Joe goes first, i.e., makes the first move.</p>

### 입력

<p>The input will consist of two lines. The first input line contains an integer, n (1 &le; n &le; 10<sup>6</sup>), the length of the permutation. The second input line contains n distinct integers, the permutation. It is guaranteed that it will be a permutation of the integers from 1 to n, and the permutation is not already sorted.</p>

### 출력

<p>If Smokin&rsquo; Joe wins, print &ldquo;Smokin Joe!&rdquo; (note that the apostrophe of Smokin&rsquo; is omitted in the output since apostrophe may come out as different ASCII characters on different machines and may cause &ldquo;format errors&rdquo; in the output). If The Outlaw wins, print &ldquo;Oh No!&rdquo;.</p>