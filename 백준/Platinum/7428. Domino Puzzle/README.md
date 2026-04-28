# [Platinum III] Domino Puzzle - 7428

[문제 링크](https://www.acmicpc.net/problem/7428)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

브루트포스 알고리즘, 많은 조건 분기, 오일러 경로, 그래프 이론

### 문제 설명

<blockquote>
<p><strong>Dominoes</strong></p>

<p>game played with small, rectangular blocks of wood or other material, each identified by a number of dots, or pips, on its face. The blocks usually are called bones, dominoes, or pieces and sometimes men, stones, or even cards. The face of each piece is divided, by a line or ridge, into two squares, each of which is marked as would be a pair of dice... The principle in nearly all modern dominoes games is to match one end of a piece to another that is identically or reciprocally numbered.</p>

<p style="text-align: right;">ENCYCLOP&AElig;DIA BRITANNICA</p>
</blockquote>

<p>Consider an arbitrary set of domino pieces where each piece is marked with two digits from 1 to 6. Some sets can be completely laid out in a row matching one end of a piece to another that is identically numbered, while others cannot. For example, the set consisting of 5 pieces: (1, 5), (1, 6), (5, 5) and (2, 4) twice, cannot be laid out in a row. However, if we add (2, 5) piece to the above set we could lay out the resulting set in the following row:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7428.%E2%80%85Domino%E2%80%85Puzzle/4dd5cbd7.png" data-original-src="https://upload.acmicpc.net/4cb1bb88-a99c-49d7-86e9-d8ad8316ed48/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 449px; height: 39px;" /></p>

<p>However, we are interested in a row having the smallest sum of digits on its pieces. In our example, instead of the piece (2, 5) with a sum of 7, we could add two pieces (1, 2) with a total sum of 6 to lay out the following row:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7428.%E2%80%85Domino%E2%80%85Puzzle/1f4351d7.png" data-original-src="https://upload.acmicpc.net/d177093c-88d7-46a6-839c-0ae5b422e1d9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 525px; height: 39px;" /></p>

<p>Your task is to write a program that for a given domino set will find an additional (possibly empty) set with the smallest possible sum of digits, so that a row could be laid out with both sets combined.</p>

### 입력

<p>The first line of the input file contains a single integer N (2 &le; N &le; 100) representing the total number of pieces in the domino set. The following N lines describe pieces. Each piece is represented on a separate line in a form of two digits from 1 to 6 separated by a space. The digits of a piece can be written in any order.</p>

### 출력

<p>On the first line of the output file write the smallest sum of digits of the additional set or 0 if that set is empty. On the second line write the total number of pieces in the additional set or 0 if that set is empty. Then write the pieces of the additional set in the same format as in input.</p>

<p>If there are a number of additional sets with the same smallest sum of digits exist then write any one of them.</p>