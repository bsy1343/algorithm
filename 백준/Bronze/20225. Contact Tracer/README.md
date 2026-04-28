# [Bronze I] Contact Tracer - 20225

[문제 링크](https://www.acmicpc.net/problem/20225)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 105, 정답: 96, 맞힌 사람: 87, 정답 비율: 90.625%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Novel virus infections are spreading. The virus is known to transmit on close contact with carriers, whether or not with any symptoms. Therefore, it is effective for epidemic prevention to identify and test those who had close contact with persons confirmed or were judged highly probable to be infected. To realize this, a system is desired that perpetually records all the close contact events by an application on mobile phones and, when infection is confirmed, identifies all persons with direct or indirect infection risks based on the record.</p>

<p>You were asked to develop such a system, and have already finished the mobile phone part. When the installed application detects a close contact event with another person carrying a phone with the same application installed, it sends IDs of both to the surveillance center.</p>

<p>Your next task is to develop a program that, when infection of a user is confirmed, identifies users with risks of direct or indirect transmission from the infected user.</p>

<p>When a user of the system is confirmed to be infected, those users who made close contacts with the infected user within a certain time period (period of communicability) are suspected of infection. If a suspected user had close contact with still another user after that possible infection event, that user also is suspected of infection. The suspects are propagated repetitively in this manner.</p>

<p>When a user is confirmed infected, the ID of the user and the list of all the close contact events of all users with all users happened after the time when the confirmed user possibly becomes a carrier are given. All the events in the given list should be assumed to be within the period of communicability of the confirmed user. The output should be the number of users to whom the virus was possibly transmitted directly or indirectly from the infected user.</p>

### 입력

<p>The input consists of multiple datasets, each in the following format.</p>

<blockquote><i>m</i>&nbsp;<i>n</i>&nbsp;<i>p</i> <i>a</i><sub>1</sub>&nbsp;<i>b</i><sub>1</sub> &hellip; <i>a<sub>n</sub></i>&nbsp;<i>b<sub>n</sub></i></blockquote>

<p>Each of the datasets starts with a line containing three integers:&nbsp;<i>m</i>&nbsp;(1 &le;&nbsp;<i>m</i>&nbsp;&le; 100) is the number of users,&nbsp;<i>n</i>&nbsp;(0 &le;&nbsp;<i>n</i>&nbsp;&le; 1000) is the number of events in the list, and&nbsp;<i>p</i>&nbsp;(1 &le;&nbsp;<i>p</i>&nbsp;&le;&nbsp;<i>m</i>) is the ID of the user confirmed to be infected.</p>

<p>The following&nbsp;<i>n</i>&nbsp;lines contain the close contact events between users, one event per line, in time order. Each line indicates that the users whose IDs are&nbsp;<i>a<sub>i</sub></i>&nbsp;and&nbsp;<i>b<sub>i</sub></i>&nbsp;had close contact. Here,&nbsp;<i>a<sub>i</sub></i>&nbsp;and&nbsp;<i>b<sub>i</sub></i>&nbsp;satisfy 1 &le;&nbsp;<i>a<sub>i</sub></i>&nbsp;&le;&nbsp;<i>m,</i>&nbsp;1 &le;&nbsp;<i>b<sub>i</sub></i>&nbsp;&le;&nbsp;<i>m,</i>&nbsp;and&nbsp;<i>a<sub>i</sub></i>&nbsp;&ne;&nbsp;<i>b<sub>i</sub></i>.</p>

<p>The end of the input is indicated by a line containing three zeros. The number of datasets does not exceed 50.</p>

### 출력

<p>For each dataset, output a single line containing the total number of users including the user confirmed to be infected and users to whom the virus was possibly transmitted directly or indirectly from the confirmed user.</p>