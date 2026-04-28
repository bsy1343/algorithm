# [Gold III] Reconstruction Trees - 7604

[문제 링크](https://www.acmicpc.net/problem/7604)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 134, 정답: 38, 맞힌 사람: 32, 정답 비율: 39.506%

### 분류

트리, 분할 정복

### 문제 설명

<p>It is very easy to produce the various traversals of a binary tree, however this problem requires you to produce the tree from the traversals. Specifically, given the pre-order and in-order traversals of a binary tree (not necessarily a binary search tree), reconstruct, if possible, the original tree.</p>

<p>For instance, the following tree will produce the traversals shown&nbsp;</p>

<pre>
      E
     / \
    D   F
   / \
  B   G
 / \   \
A   C   I
       / \
      H   K
         /
        J

Preorder : EDBACFGIHKJ
Inorder : ABCDEFGHIJK

Postorder: ACBDHJKIGFE </pre>

### 입력

<p>Input will consist of representations of several trees, each on a single line, and terminated by a #. Each line will consist of two strings of up to 26 unique uppercase letters in the form</p>

<p>&lt;pre-order&gt; &lt;space&gt; &lt;in-order&gt;.</p>

<p>You can assume that the two strings will be permutations of each other.&nbsp;</p>

### 출력

<p>Output will consist of the post-order traversal of the reconstructed tree if possible, otherwise the words &#39;Invalid tree&#39;.&nbsp;</p>