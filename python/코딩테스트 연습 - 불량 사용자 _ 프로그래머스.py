from itertools import permutations 

def check(users,banned_ids):
    for user, banned_id in zip(users, banned_ids):
        if len(user) != len(banned_id):
            return False

        for j in range(len(user)):
            if banned_id[j] == "*":
                continue
            if banned_id[j] != user[j]:
                return False 
    
    return True

def solution(user_id, banned_id):
    user_permutation = list(permutations(user_id,len(banned_id)))
    _set = []

    for users in user_permutation:        
        if not check(users, banned_id):
            continue 
        else:
            users = set(users)
            if users not in _set:
                _set.append(users)

    return len(_set)